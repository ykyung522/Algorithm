import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        // 유효성 검사
        if (a.length() < 1 || a.length() > 20) {
            System.out.println("문자열 길이는 1 이상 20 이하만 가능합니다.");
            return;
        }

        if (!a.matches("[a-zA-Z]+")) {
            System.out.println("알파벳 이외의 문자가 포함되어 있습니다.");
            return;
        }

        // 변환 로직
        StringBuilder result = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println(result.toString());
    }
}
