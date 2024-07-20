#include<iostream>
using namespace std;

long long arr[100];

long long fib(int n) {

    // Base Condition
    if (n <= 1) {
        
        return n;
    }
    return fib(n-1) + fib(n-2);    

}

long long fib2(int n) {

    // Base Condition
    long long a = 0;
    long long b = 1;
    long long ans = 0;

    for (int i=2; i<=n; i++) {
        ans = a + b;
        a = b;
        b = ans;
    }   
    return ans;
}

int main() {
    int n;
    n = 50;

    cout << n << endl;

    return 0;
}