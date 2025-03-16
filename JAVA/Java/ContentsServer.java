import java.net.*;    
import java.io.*;
public class ContentsServer   
{
  public static void main(String args[]) throws Exception
  {                           // establishing the connection with the server
     ServerSocket sersock = new ServerSocket(4000);
     System.out.println("Server ready for connection");
     Socket sock = sersock.accept();            // binding with port: 4000
     System.out.println("Connection established...");
                                                                                                 
                               // reading the file name from client
     
BufferedReader in =new BufferedReader(new InputStreamReader(sock.getInputStream()));
 DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

String fname = in.readLine( );
                             // reading file contents
FileReader fr=null;
BufferedReader file=null;
boolean flag;

File f=new File(fname);

if(f.exists()) 
flag=true;
else
flag=false;

if(flag == true) 
dout.writeBytes("YES"+"\n");
else
dout.writeBytes("NO"+"\n");

if(flag == true) 
{
fr= new FileReader(fname);
file= new BufferedReader(fr);

String str;

while((str=file.readLine()) != null)
{
	dout.writeBytes(str+"\n");
}
    sock.close();  
sersock.close();       // closing network sockets
 fr.close(); 
file.close();
dout.close();
in.close();
  }
}
}