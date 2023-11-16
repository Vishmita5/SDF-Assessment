import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        
      try {
ServerSocket listener = new ServerSocket(3000);
while (!finished) {
Socket client = listener.accept(); 
InputStream in = client.getInputStream();
OutputStream out = client.getOutputStream();

BufferedReader bin =
new BufferedReader(new InputStreamReader(in) );
String someString = bin.readLine();

client.close();
}
listener.close();
} catch (IOException e) {
System.err.println(e);
}
}
}