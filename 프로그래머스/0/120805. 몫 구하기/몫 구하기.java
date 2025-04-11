class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1>=0 && num1<=100 || num2>=0 && num2<=100){
            answer=num1/num2;
        }else{
            throw new IllegalArgumentException("입력 값이 0이상 100이하의 값이어야 합니다.");
        }
        return answer;
    }
}