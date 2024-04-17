package lab5;

public class FunWithStrings {

    public void findLongest(String s) {
        String[] ss = s.split(" ");
        String i = "";
        for (String j : ss) {
            if (j.length() > i.length()) {
                i = j;
            }
        }
        System.out.println(i);
    }

    public void isPalindrom(String s) {
        StringBuilder ss = new StringBuilder(s);
        StringBuilder ex = new StringBuilder(s).reverse();
        System.out.println(ss.toString().contentEquals(ex));
    }

    public void censored(String s) {

        StringBuilder res = new StringBuilder();

        for (String j : s.split(" ")) {
            if (j.equals("бяка")) {
                res.append(" [вырезано цензурой] ");
            } else {
                res.append(j);
            }
        }
        System.out.println(res);
    }

    public void numsOccures(String subString, String string) {

        int count = 0;
        int index = 0;
        while ((index = string.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }
        System.out.println(count);
    }

    public void invert(String s) {

        String res = "";
        for (String i : s.split(" ")) {
            StringBuilder j = new StringBuilder(i).reverse();
            res += j;
            res += " ";
        }
        System.out.println(res.trim());
    }
}


