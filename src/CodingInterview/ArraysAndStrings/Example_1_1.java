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
//        result = isDuplicateBySort(string);

        printResult(result);

    }

    private static void printResult(boolean result) {
        if (result) System.out.println("같은 문자 중복");
        else System.out.println("같은 문자 없음");
    }

    public static boolean isDuplicateByAscii(String string) {

        boolean[] visited_Ascii = new boolean[128];
        for (int i = 0; i < string.length(); i++) {
            if (visited_Ascii[string.charAt(i)]) {
                return true;
            }
            visited_Ascii[string.charAt(i)] = true;
        }
        return false;
    }

    public static boolean isDuplicateBySort(String string) {
        char[] chars = string.toCharArray();
        Character[] characters = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            characters[i] = chars[i];
        }
        sort(characters, 0, chars.length - 1);
        return isFindDuplicate(characters);
    }

    public static <T extends Comparable<T>> boolean isFindDuplicate(T[] characters) {

        for (int i = 0; i < characters.length - 2; i++) {
            if (characters[i].compareTo(characters[i + 1]) == 0) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> void sort(T[] array, int start, int end) {
        if (start >= end) return;
        int r = getPivot(array, start, end);
        sort(array, start, r - 1);
        sort(array, r, end);
    }

    public static <T extends Comparable<T>> int getPivot(T[] numbers, int start, int end) {
        T pivot = numbers[(start + end) / 2];
        while (start <= end) {
            while (numbers[start].compareTo(pivot) < 0) start++;
            while (numbers[end].compareTo(pivot) > 0) end--;
            if (start <= end) {
                swap(numbers, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
