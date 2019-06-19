package CodingInterview.ArraysAndStrings;

/*
 * 중복이 없는가
 * 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
 * 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
 * */
public class Example_1_1 {

    public static void main(String[] args) {

        String string = "aAbBcCdDeEaA";

        boolean result = isDuplicateByAscii(string);

        if (result) System.out.println("같은 문자 중복");
        else System.out.println("같은 문자 없음");
    }

    public static boolean isDuplicateByAscii(String string) {

        boolean[] visited_Ascii = new boolean[128];
        for (int i = 0; i < string.length(); i++) {
            if(visited_Ascii[string.charAt(i)]) {
                return true;
            }
            visited_Ascii[string.charAt(i)] = true;
        }
        return false;
    }
}
