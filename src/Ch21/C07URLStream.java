package Ch21;

import java.io.*;
import java.net.URL;

public class C07URLStream {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.naver.com");
        InputStream in = url.openStream(); // 기본 스트림
        BufferedInputStream bin = new BufferedInputStream(in); //보조 스트림 (버퍼공간 추가)
        Reader r = new InputStreamReader(in); //보조 스트림 (스트림(1byte)->문자형(2byte)으로 받음)

        OutputStream out = new FileOutputStream("c:\\iotest\\index.html");
        Writer wout = new OutputStreamWriter(out); //보조스트림(byte->char로 변환)

        while (true) {
            int data = r.read();
            if (data == -1) {
                break;
            }
            System.out.print((char) data);
            wout.write(data);
        }

    }
}
