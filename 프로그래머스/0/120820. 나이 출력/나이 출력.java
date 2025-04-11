class Solution {
    public int solution(int age) {
        int answer = 0;
        if( age>0 && age<=120){
            answer=(2022-age)+1;
        }else{
            throw new IllegalArgumentException("나이는 0보다 커야 하며 120이하여야 합니다.");      
        }
        return answer;
    }
}