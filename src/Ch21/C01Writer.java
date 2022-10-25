package Ch21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01Writer {
    public static void main(String[] args) throws IOException {
        Writer out = new FileWriter("c:\\iotest\\test.txt");
        out.write("국밥\n");
        out.write("돈까스");

        out.flush();
        out.close();
    }
}
