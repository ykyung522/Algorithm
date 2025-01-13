#include<stdio.h>
#include<time.h>

int main(){
    time_t t;
    time(&t);
    t-=9*3600;
    struct tm *timeinfo =gmtime(&t);
    printf("%d\n", timeinfo->tm_year+1900);
    printf("%02d\n", timeinfo->tm_mon+1);
    printf("%02d\n", timeinfo->tm_mday);
    return 0;
    
}