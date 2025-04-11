class Solution {
    public int[][] solution(int n) {
        int[][] arr =new int[n][n]; //시계방향으로 숫자가 증가하는 느낌
        int num=1;
        int startRow= 0;
        int endRow= n-1;
        int startCol= 0;
        int endCol= n-1;
        
        while(num<=n*n){
            for(int i=startCol; i<=endCol; i++){
                arr[startRow][i]=num;
                num++;
            }
            startRow++;
            
            for(int i=startRow; i<=endRow; i++){
                arr[i][endCol]=num;
                num++;
            }
            endCol--;
            
            for(int i=endCol; i>=startCol; i--){
                arr[endRow][i]=num;
                num++;
            }
            endRow--;
            
            for(int i=endRow; i>=startRow; i--){
                arr[i][startCol]=num;
                num++;
            }
            startCol++;
        }
        return arr;
        //직접 그림을 그려서 가로, 세로 구분하며 풀어가면 이해가 빠르다.
    }
}