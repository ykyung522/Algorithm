class Solution {
    public int solution(String[] babbling) { //단어들이 들어온다.
        int answer = 0;
        int babbling_lenght=babbling.length; //길이
        
        if(babbling_lenght>=1 && babbling_lenght<=100){
            for(int i=0; i<babbling_lenght; i++){ //하나씩 제거하는 방식으로
                babbling[i]= babbling[i].replace("aya"," ");
                babbling[i]= babbling[i].replace("ye"," ");
                babbling[i]= babbling[i].replace("woo"," ");
                babbling[i]= babbling[i].replace("ma"," ");
                babbling[i]= babbling[i].replace(" ","");
                //주의할 점 replace할 때 " " 공백이 없으면 제거되었는지 모를 수도 있음. 흔적 남기는 거 같은 것.
                
            
                if(babbling[i].equals("")){
                    answer++;
                }
            }
        }
        return answer;
    }
}