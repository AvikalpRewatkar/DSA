#include <iostream>
using namespace std;

int iter_fib(int n) {
    int first = 0;
    int second = 1;
    int third;
    
    for (int i = 2; i <= n; i++) {
        third = first + second;
        first = second;
        second = third;
    }
    return third;
}

int rec_fib(int n) {
    if (n == 0) return n;
    if (n == 1) return n;

    return rec_fib(n-1) + rec_fib(n-2);
}

int dp_iter_fib(int n) {
    int dp[n+2];
    dp[0] = 0;
    dp[1] = 1;
    
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
}

int dp_rec_fib(int n) {
    int dp[n+2];
    
    if (n <= 1) {
        dp[n] = n;
    }

    

}

int main()
{
    /* code */

    int n = 10;

    cout << iter_fib(7) << endl;
    cout << rec_fib(7) << endl;
    cout << dp_iter_fib(7) << endl;




    return 0;
}
