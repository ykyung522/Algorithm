#include<stdio.h>

int main() {
    int N;
    long long result = 1;  
    scanf("%d", &N);
    for(int i = 1; i <= N; i++) {
        result *= i;
    }
    printf("%lld\n", result);  // long long 출력 형식 사용

    return 0;
}
