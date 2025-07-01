# MULTITHREADED-CHAT-APPLICATION

*COMPANY*: CODTECH IT SOLUTIONS
*NAME*: Dirghayush Umakant Sogale
*INTERN ID*: CITS0D178
*DOMAIN*: Network Programming and Multithreading in Java
*DURATION*: 4 WEEKS
*MENTOR*: NEELA SANTOSH

# DESCRIPTION OF TASK:
As part of my internship at CODTECH IT SOLUTIONS, I was assigned the task of building a "Multithreaded Chat Application" using Java. The objective was to create a real-time communication system where multiple users can send and receive messages through a central server, demonstrating the concepts of socket programming and multithreading.

This application consists of two main components: a server and multiple clients. The server listens for incoming client connections using `ServerSocket`. Each time a new client connects, the server spawns a new thread to handle communication with that client, allowing simultaneous messaging between multiple users without interruption.

On the client side, a `Socket` is used to connect to the server. Each client has two separate threads: one for reading messages from the server and one for writing messages to the server. This ensures real-time, non-blocking interaction, meaning users can type and receive messages at the same time.

Key concepts applied in this project include:

Java Sockets for establishing TCP connections.
Multithreading*for handling multiple users concurrently.
Input/Output Streams for sending and receiving data.
Broadcasting messages to all connected clients.
 Gracefully handling client disconnection.

The application runs in a command-line interface. When a client starts, it prompts the user to enter a name. Once connected, any message typed is sent to the server and then broadcast to all other connected users. This mimics a simple group chat environment.

This task enhanced my practical understanding of core Java concepts like classes, threads, exceptions, and networking. It also helped me understand how real-time communication applications are structured and managed in backend systems.

By the end of the internship, I had successfully developed and tested a basic but functional chat system capable of supporting multiple concurrent users in real-time.

#OUTPUT
![Image](https://github.com/user-attachments/assets/cb173882-a5c2-4adb-bc58-d53039946220)
