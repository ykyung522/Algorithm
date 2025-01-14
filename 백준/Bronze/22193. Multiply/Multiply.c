#include <stdio.h>

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    char a[50000], b[50000];
    scanf("%s\n%s", a, b);

    int result[100000];

    for (int i = 0 ; i < m ; i++) {
        for (int j = 0 ; j < n ; j ++) {
            int temp = (a[n-1-j]-'0') * (b[m-1-i]-'0'); //문자에서 '0'을 빼면 숫자와 동일
            result[n+m-1-i-j] += temp;  
        }
    }

    for (int i = n+m-1 ; i > 0 ; i--) {
        result[i-1] += result[i] / 10;
        result[i] %= 10; 
    }

    int flag = 0;
    for (int i = 0 ; i < n+m ; i++) {
        if (flag == 0) {
            if (result[i] != 0)
                flag = 1;
            else if (i == n+m-1)
                printf("0");
        }
        if (flag != 0)
            printf("%d", result[i]);
    }
    return 0;
}