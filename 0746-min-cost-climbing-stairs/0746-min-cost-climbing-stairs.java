class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int[] map = new int[n+1];
        
        for (int i=0; i<n; i++) {
		    if (i<2) {
                 map[i] = cost[i];
            } else {
                map[i] = cost[i] + Math.min(map[i-1], map[i-2]);
	
            }
        }
        
        return Math.min(map[n-1], map[n-2]);       
    }
}