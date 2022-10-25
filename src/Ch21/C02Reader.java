package Ch21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02Reader {
    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("c:\\iotest\\test.txt");
        while (true)
        {
            int data = in.read();
            if (data ==-1) {
                break;
            }
            System.out.print((char) data);
        }
    }
}
