#include<stdio.h>

int main(){
    char itchar[5]; 
    scanf("%s",itchar);
    if (strcmp(itchar, "NLCS") == 0) {
       printf("North London Collegiate School\n");
    }else if (strcmp(itchar, "BHA") == 0) {
       printf("Branksome Hall Asia\n");
    }else if (strcmp(itchar, "KIS") == 0) {
       printf("Korea International School\n");
    }else if (strcmp(itchar, "SJA") == 0) {
       printf("St. Johnsbury Academy\n");
    }
    return 0;
    
}