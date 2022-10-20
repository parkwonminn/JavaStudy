package C17;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class C04Simple
{
    int x,y;
    C04Simple(int x, int y) {
        this.x=x;
        this.y=y;
    }
    @Override
    public int hashCode() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return x + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof C04Simple) {
            C04Simple down = (C04Simple) obj;
            return this.x == down.x && this.y == down.y;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "C04Simple{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class C03ObjectHashCode {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println("--------------------");
        System.out.printf("%x\n", obj1.hashCode());
        System.out.printf("%x\n", obj2.hashCode());
        System.out.println("--------------------");
        System.out.printf("%x\n", System.identityHashCode(obj1));
        System.out.printf("%x\n", System.identityHashCode(obj2));
    }
}
