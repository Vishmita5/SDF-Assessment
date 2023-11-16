import java.io.*;
import java.net.*;
public class Client 
{
    public static void main(String args[])
    {
    try
        {
          Socket server;
          String str="";
          DataInputStream d=new DataInputStream(System.in);
          PrintStream toserver;
          BufferedReader fromserver;
          server=new Socket(3000);
          InputStreamReader isr=new InputStreamReader(server.getInputStream());
          fromserver= new BufferedReader(isr);
          toserver=new PrintStream(server.getOutputStream());
          while(true)
           {
           toserver.println(str);
           str=fromserver.readLine();
           System.out.println(str);
           }
        }
    catch(Exception e)
        {
         System.out.println(e);
        }
    }
}