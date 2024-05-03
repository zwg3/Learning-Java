package lab10.Task4;
import java.io.*;


public class Dollarize {

    public static File getFile(String path) {
        return new File(path);
    }

    public static FileReader getReader(String path) throws IOException {
        return new FileReader(getFile(path));
    }

    public static FileWriter getWriter(String path) throws IOException {
        return new FileWriter(getFile(path));
    }

    public static BufferedReader getBuffReader(String path) throws IOException {
        return new BufferedReader(getReader(path));
    }

    public static BufferedWriter getBuffWriter(String path) throws IOException {
        return new BufferedWriter(getWriter(path));
    }


    public static void toUsd(String path) {

        StringBuilder res = new StringBuilder();

        try (BufferedReader reader = getBuffReader(path)) {
            String s;
            while ((s = reader.readLine()) != null) {
                s = s.replaceAll("[^a-zA-Z0-9]", "\\$");
                res.append(s);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter writer = getBuffWriter(path)) {
            writer.write(res.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
