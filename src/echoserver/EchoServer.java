package echoserver;
import java.net.*;
import java.io.*;

/*
public class EchoServer {
    public static final int portNumber = 6013;

  public static void main(String[] args) {
    try {
      // Start listening on the specified port
      ServerSocket sock = new ServerSocket(portNumber);

      // Run forever, which is common for server style services
      while (true) {
        // Wait until someone connects
        Socket client = sock.accept();
        System.out.println("Got a request!");
       InputStream input = client.getInputStream();
        

        OutputStream output = client.getOutputStream();

        // Send the current input back to the client.
        int inputByte = input.read();
        output.flush();
        output.write(inputByte);

        // Close the client socket since we're done.
        input.close();
        output.close();
        client.close();
      }
    // *Very* minimal error handling.
    } catch (IOException ioe) {
      System.out.println("We caught an unexpected exception");
      System.err.println(ioe);
    }
  }
}
*/


public class EchoServer {
  public static final int portNumber = 6013;

  public static void main(String[] args) {
    try {
      // Start listening on the specified port
      ServerSocket sock = new ServerSocket(portNumber);

      // Run forever, which is common for server style services
      while (true) {
        // Wait until someone connects, thereby requesting a date
        Socket client = sock.accept();
        System.out.println("Got a request!");

        // Construct a writer so we can write to the socket, thereby
        // sending something back to the client.
        InputStream input = client.getInputStream();

        // Send the current date back tothe client.
        OutputStream output = client.getOutputStream();
        int inputByte;
        int cab;
        while ((inputByte =System.in.read()) != -1) {
          output.flush();
          output.write(inputByte);
        }


        // Close the client socket since we're done.
        client.close();
      }
    // *Very* minimal error handling.
    } catch (IOException ioe) {
      System.out.println("We caught an unexpected exception");
      System.err.println(ioe);
    }
  }
}


/*
public class EchoServer {
  public static final int portNumber = 6013;

  public static void main(String[] args) {
    try {
      // Start listening on the specified port
      ServerSocket sock = new ServerSocket(portNumber);

      // Run forever, which is common for server style services
      while (true) {
        // Wait until someone connects, thereby requesting a date
        Socket client = sock.accept();
        System.out.println("Got a request!");

        InputStream input = client.getInputStream();
        // Construct a writer so we can write to the socket, thereby
        // sending something back to the client.
        PrintWriter writer = new PrintWriter(client.getOutputStream(), true);

        // Send the current date back tothe client.
        writer.println(input);

        // Close the client socket since we're done.
        client.close();
      }
    // *Very* minimal error handling.
    } catch (IOException ioe) {
      System.out.println("We caught an unexpected exception");
      System.err.println(ioe);
    }
  }
}
*/