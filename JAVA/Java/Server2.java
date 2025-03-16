import java.io.*;
import java.net.*;
class Server2
{
  public static void main(String args[])throws Exception
  {
    ServerSocket ss=new ServerSocket(777);
    Socket s=ss.accept();
    System.out.println("Connection Established\n");
    OutputStream obj=s.getOutputStream();
    PrintStream ps=new PrintStream(obj);
    BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
    BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
    while(true)
    {
       String str,str1;
       while((str=br.readLine())!=null)
       {
          System.out.println(str);
          str1=kb.readLine();
          ps.println(str1);
       }
    
   
       ps.close();
       br.close();
       kb.close();
       ss.close();
       s.close();
       System.exit(0);

    }
   
  }
}
