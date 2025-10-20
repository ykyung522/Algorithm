import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int last = num_list[len - 1];
        int beforeLast = num_list[len - 2];

        int newValue = (last > beforeLast) ? (last - beforeLast) : (last * 2);

        int[] answer = Arrays.copyOf(num_list, len + 1);
        answer[len] = newValue;

        return answer;
    }
}
