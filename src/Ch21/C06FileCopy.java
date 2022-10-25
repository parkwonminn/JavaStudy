package Ch21;

import java.io.*;

public class C06FileCopy {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("c:\\iotest\\dog.jpg");
        OutputStream out = new FileOutputStream("c:\\iotest\\copy.jpg");

        byte[] buff = new byte[4096];

        while (true) {
            int cnt = in.read(buff); //buff크기만큼 읽어와서 buff에저장,읽은 개수를 리턴

        }
    }
}
