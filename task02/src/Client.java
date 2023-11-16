import java.io.*;
import java.net.*;
public class Client 
{
    public static void main(String args[])
    {
     try { Socket server = new Socket("localhost", 3000); 
       // INFO: Backend https://sdfb4.chuklee.com is accessible

       InputStream in = server.getInputStream();
       OutputStream out = server.getOutputStream();
        
    
/
        BufferedReader bin =
        new BufferedReader(new InputStreamReader(in) );
        String response = bin.readLine();
        server.close();
} 
catch (IOException e) {
System.err.println(e);