import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();// establishes connection
            DataInputStream data = new DataInputStream(s.getInputStream()); //create  object to receive data
            DataOutputStream dout = new DataOutputStream(s.getOutputStream()); //create object to send data
             
            ///receiving data from Client
            String str = (String) data.readUTF();
            System.out.println("message : " + str);

            //seding data to Client
            dout.writeUTF("Hello Clinet");

            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}