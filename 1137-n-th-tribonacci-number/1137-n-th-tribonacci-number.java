class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        
        if (n <= 2) {
            return 1;
        }
        
        int[] map = new int[n+4];
        map[0] = 0;
        map[1] = 1;
        map[2] = 1;
        
        for(int i = 0; i <= n; i++) {
            map[i+3] = map[i] + map[i+1] + map[i+2]; 
        }
        
        return map[n];
    }
}