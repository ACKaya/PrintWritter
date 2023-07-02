import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        File file=new File("test.txt");
        try {
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.write("abc"+123);
            printWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
