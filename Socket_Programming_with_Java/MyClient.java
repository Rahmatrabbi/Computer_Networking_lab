import java.io.*;
import java.net.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.0.105", 6666); // loop back address : 127.0.0.1
            DataOutputStream dout = new DataOutputStream(s.getOutputStream()); //create object to send data
            DataInputStream din = new DataInputStream(s.getInputStream()); //create object to receive data

            // sending data from Client to server
            dout.writeUTF("Hello Server");

            // receiving data from Client
            String str = (String) din.readUTF();
            System.out.println("message : " + str);

            dout.flush();
            dout.close();
            din.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}