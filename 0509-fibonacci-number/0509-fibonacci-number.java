class Solution {
    public int fib(int n) {
        // easy base cases/edge cases
	    if (n <= 1) {
		    return n;            
	    }
        
        int[] fibonacciMap = new int[n+1];
        
        fibonacciMap[0] = 0;
        fibonacciMap[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            fibonacciMap[i] = fibonacciMap[i-1] + fibonacciMap[i-2];
        }
        
        return fibonacciMap[n];
    }
}