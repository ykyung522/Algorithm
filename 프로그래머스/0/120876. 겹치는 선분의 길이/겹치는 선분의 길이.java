class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        //-100 ≤ a < b ≤ 100 총 201칸
        int[] line=new int[201];
        
        //선분 하나씩 그려야 하니깐...
        for(int i=0; i<lines.length; i++){
            int start=lines[i][0];
            int end=lines[i][1];
            
            for(int j=start; j<end; j++){// j<end; 이는 길이를 위함. 일반적으로 0,2라고 하면 길이를 3이라고 생각할 수 있음
                                        // 그래서 끝을 포함 안하고 숫자만으로 선분이 지나가는 부분을 확인하기 위함 => 총 길이 2
                int index=j+100; // 음수가 아닌 0에서 200으로 맞추기 위함.(-100 ≤ a < b ≤ 100)
                line[index]++; // 몇개의 선분이 그 위치에 지나가는 지를 기록하기 위함.
            }
            //지나는 숫자에서 증가하는 수를 포함한 유형
        }
        
        //겹치는 선이면 2이상이므로 그것을 판별하는 부분
        for(int i=0; i<=200; i++){
            if(line[i]>=2){
                answer++;
            }
        }
         
        
        return answer;
    }
}