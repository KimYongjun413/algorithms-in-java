package CodingInterview.ArraysAndStrings;

/*
* 순열 확인
* 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하는 메서드를 작성하라.
* */
public class Example_1_2 {
    public static void main(String[] args) {

        if(isPermutation("show me the money","wohs em eht yenom")) {
            System.out.println("순열관계");
        }
        else {
            System.out.println("비순열관계");
        }

    }

    public static boolean isPermutation(String strA, String strB) {

        if(strA.length() != strB.length()) {
            return false;
        }

        return sort(strA).equals(sort(strB));
    }

    public static String sort(String str) {
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}
