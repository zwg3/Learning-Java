package lab10.Task2;
import java.io.*;

public class WriteMe {

    public static File getFile(String path) {
        return new File(path);
    }

    public static FileWriter getWriter(String path) throws IOException {
        return new FileWriter(getFile(path), true);
    }

    public static BufferedWriter getBuffWriter(String path) throws IOException {
        return new BufferedWriter(getWriter(path));
    }

    public static void writing(String line, String path){
        try (BufferedWriter w = getBuffWriter(path)) {
            w.write(line);
            }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
