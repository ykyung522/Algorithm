#include<stdio.h>

int main(){
    int arr[7]={1,1,2,2,2,8};
    int a;
    int i;
    
    for(i=0;i<6;i++){
        scanf("%d", &a);
        printf("%d ", arr[i]-a);
    }
    return 0;
}