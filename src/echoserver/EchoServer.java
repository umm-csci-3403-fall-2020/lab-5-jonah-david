package echoserver;

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

        InputStream input = new InputStreamReader(client.getInpitStream());
        int b = input.read();

        OutputStream output = new OutputStreamWriter(client.getOutputStream());

        // Send the current input back to the client.
        output.flush(b);
        output.write(b)

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