package Ch21;

import java.io.*;

public class C03FileCopy {
    public static void main(String[] args) throws IOException {

        Reader in = new FileReader("c:\\iotest\\original.txt");
        Writer out = new FileWriter("c:\\iotest\\copyfile.txt");

        //버퍼 배열
        char buff[] = new char[4096];

        while (true)
        {
            int cnt=in.read(buff); //buff크기만큼 읽어서 buff에 저장 한뒤 읽은 개수를 cnt에 전달
            if (cnt==-1){
                break;
            }
            System.out.println("CNT : " + cnt);
            out.write(buff);
            out.flush();
        }
    }
}
