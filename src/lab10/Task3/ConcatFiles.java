package lab10.Task3;

import java.io.*;

public class ConcatFiles {

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

    public static void concFiles(String path1, String path2, String resPath) throws IOException {

        StringBuilder res = new StringBuilder();

        try (BufferedReader reader1 = getBuffReader(path1)) {

            String s;
            while ((s = reader1.readLine()) != null) {
                res.append(s);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader reader2 = getBuffReader(path2)) {
            String s;
            while ((s = reader2.readLine()) != null) {
                res.append(s);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter writer = getBuffWriter(resPath)) {
            writer.write(res.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}




