package lab10.Task1;
import java.io.*;
import java.util.ArrayList;

public class StrList {

    public static File getFile(String path) {
        return new File(path);
    }

    public static FileReader getReader(String path) throws IOException {
        return new FileReader(getFile(path));
    }

    public static BufferedReader getBuffReader(String path) throws IOException {
        return new BufferedReader(getReader(path));
    }

    public static ArrayList<String> stringify(String path){
        ArrayList<String> res = new ArrayList<>();
        try (BufferedReader r = getBuffReader(path)) {
            String s;
            while ((s = r.readLine()) != null) {
                res.add(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
}
