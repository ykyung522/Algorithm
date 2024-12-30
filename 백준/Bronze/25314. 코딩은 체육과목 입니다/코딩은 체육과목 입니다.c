#include<stdio.h>

int main(){
    int a;
    
    scanf("%d",&a);
    int  long_count =a/4;
        
    for(int i=0; i<long_count;i++){
        printf("long ");
    }
    printf("int\n");
    return 0;
}