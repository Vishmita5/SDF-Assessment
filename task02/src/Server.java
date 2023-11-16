import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) throws Exception {
        
        int port= 3000;
        ServerSocket s = new ServerSocket(port);
        Socket cl;
        DataInputStream data;
        PrintStream toCl;
        BufferedReader fromCl;
        String str="";
        try
              {
               data=new DataInputStream(System.in);
               s=new ServerSocket(3000);        
               System.out.println("Server Started");
               cl=s.accept();
               InputStreamReader isr=new InputStreamReader(client.getInputStream());
               fromCl=new BufferedReader(isr);
               toCl=new PrintStream(cl.getOutputStream());
               while(true)
                {
                str=fromCl.readLine();
                System.out.println(str);
                str=":"+d.readLine();
                toCl.println(str);
                }
              }
       catch(Exception e)
              {
                System.out.println(e);
              }
    }
}

        
        


        