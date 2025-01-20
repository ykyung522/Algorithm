#include <stdio.h>

int main() {
    int T;
    
    scanf("%d", &T);
    int a_count = T / 300;  
    T %= 300;  
    
    int b_count = T / 60;  
    T %= 60;  
    
    int c_count = T / 10;  
    T %= 10;   
    
    if (T == 0) {
        printf("%d %d %d\n", a_count, b_count, c_count);
    } else {
        printf("-1\n");
    }

    return 0;
}
