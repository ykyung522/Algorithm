import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            String str = sc.next();
            int n;

            // 정수 입력 검증
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            } else {
                System.out.println("반복 횟수는 정수여야 합니다.");
                return;
            }

            // [입력값 검증
            if (str.length() < 1 || str.length() > 10) {
                System.out.println("문자열 길이는 1 이상 10 이하이어야 합니다.");
                return;
            }

            if (n < 1 || n > 5) {
                System.out.println("반복 횟수 n은 1 이상 5 이하이어야 합니다.");
                return;
            }

            StringBuilder sb = new StringBuilder(str.length() * n);
            for (int i = 0; i < n; i++) {
                sb.append(str);
            }

            System.out.println(sb.toString());

        } catch (Exception e) {
            System.out.println("⚠️ 입력 처리 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
