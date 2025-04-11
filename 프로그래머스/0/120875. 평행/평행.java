class Solution {
    public int solution(int[][] dots) { //평행 1, 0
        int answer = 0;
        
        //우선 직선이 평행하려면, 두 직선의 기울기가 같으면 된다.
        int x1=dots[0][0];
        int x2=dots[1][0];
        int x3=dots[2][0];
        int x4=dots[3][0];
        
        int y1=dots[0][1];
        int y2=dots[1][1];
        int y3=dots[2][1];
        int y4=dots[3][1];
        
        //기울기 => 이땐 dots[0], dots[1], dots[2], dots[3] 이런 식으로 생각하고 비교하면 좀 더 수월하다.
        //1,2 == 3,4
        //(y2-y1)/(x2-x1)==(y4-y3)/(x4-x3) 
        //1,3 == 2,4
        //(y3-y1)/(x3-x1)==(y4-y2)/(x4-x2)  
        //1,4 == 2,3
        //(y4-y1)/(x4-x1)==(y3-y2)/(x3-x2)    
        
        if(
            (y2-y1)*(x4-x3)==(y4-y3)*(x2-x1) ||
            (y3-y1)*(x4-x2)==(y4-y2)*(x3-x1) ||
            (y4-y1)*(x3-x2)==(y3-y2)*(x4-x1)
        ){
            answer=1;
        }
        
        return answer;
    }
}