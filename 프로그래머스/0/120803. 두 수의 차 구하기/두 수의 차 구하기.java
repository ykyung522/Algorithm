class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1>=-50000 && num1<=50000 || num2>=-50000 && num2<=50000){
            answer=num1-num2;
        }else{
            throw new IllegalArgumentException("입력 값은 -50000이상 50000이하여야 합니다.");
        }
        return answer;
    }
}