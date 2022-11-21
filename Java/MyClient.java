import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.xml.crypto.Data;

public class MyClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("127.0.0.1", 6666);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        dos.writeUTF("Hello World Joy");
        String msg = dis.readUTF();
        System.out.println(msg);
        dos.flush();
        dos.close();
        s.close();

    }
}
