package lab5;

public class Main {
    public static void main(String[] args) {
        FunWithStrings fun = new FunWithStrings();
        //TASK 1
        String s = "short longer thelongest";
        fun.findLongest(s);

        //TASK 2
        String palindrome = "saippuakivikauppias";
        fun.isPalindrome(palindrome);

        //TASK 3
        String toCensor = "Ты бяка противная! бяка";
        fun.censored(toCensor, "бяка", "[вырезано цензурой]");

        //TASK 4
        fun.numsOccures("Hello", "Helloworld!HellohiHellohelp");

        //TASK 5
        fun.invert("This is a test string");
    }
}
