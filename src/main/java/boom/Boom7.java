package boom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Boom7 {

    public static void boom(String fileName, int end) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(file);
        for (int i = 1; i <= end; i++) {
            boolean isFound = false;
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == 7) {
                    isFound = true;
                    pw.println("boom");
                    break;
                }
                temp /= 10;
            }
            if (!isFound && i % 7 == 0) {
                pw.println("boom");
            } else {
                if (!isFound) {
                    pw.println(i);
                }
            }
        }
        pw.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        boom("bb.txt", 20);
    }
}
