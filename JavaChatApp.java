
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        System.out.println("Connected to the chat server");

        new ReadThread(socket).start();
        new WriteThread(socket).start();
    }

    static class ReadThread extends Thread {
        @SuppressWarnings("FieldMayBeFinal")
        private BufferedReader reader;

        public ReadThread(Socket socket) throws IOException {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }

        public void run() {
            try {
                String message;
                while ((message = reader.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (IOException ex) {
                System.out.println("Connection closed.");
            }
        }
    }

    static class WriteThread extends Thread {
        private PrintWriter writer;
        private Scanner scanner;

        public WriteThread(Socket socket) throws IOException {
            writer = new PrintWriter(socket.getOutputStream(), true);
            scanner = new Scanner(System.in);
        }

        public void run() {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            writer.println(name + " joined the chat.");

            while (true) {
                String msg = scanner.nextLine();
                writer.println(name + ": " + msg);
            }
        }
    }
}
