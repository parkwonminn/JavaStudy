package Ch21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04OutputStream {
    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("c:\\iotest\\test.exe");
        out.write('a');
        out.write('b');
        out.write('c');
        out.flush();
    }
}
