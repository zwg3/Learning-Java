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

    public void isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder ss = new StringBuilder(s);
        StringBuilder ex = new StringBuilder(s).reverse();
        System.out.println(ss.toString().contentEquals(ex));
    }

    public void censored(String message, String wordToReplace, String replacement ) {
        message = message.replace(wordToReplace, replacement);
        System.out.println(message);
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

        StringBuilder res = new StringBuilder();
        for (String i : s.split(" ")) {
            StringBuilder j = new StringBuilder(i).reverse();
            res.append(j + " ");
        }
        System.out.println(res.toString().trim());
    }
}


