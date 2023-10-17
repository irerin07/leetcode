class Solution {
    public int islandPerimeter(int[][] grid) {
        // Create a beeloean visited array with same size as grid
        boolean[][] visited = new boolean[grid.length][grid[0].length];     
        // iterate over grid and call getPerimeterDFS if the cell value is 1
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
               if (grid[row][col] == 1) {
                    return getPerimeterDFS(grid, visited, row, col);
               }
            }
        }
        
        // retrun 0 if no land found
        return 0;
    }
    
    // helper method to calculate perimeter recursively 
    private int getPerimeterDFS(int[][] grid, boolean[][] visited, int row, int col) {
        // Check boundary conditions and return 1, since it is water
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return 1;
        }
        // Check if the cell is water and return 1. No need to do a DFS
        if (grid[row][col] == 0) {
            return 1;
        }
        
        // check if the cell is already visisted and return 0
        if (visited[row][col]) {
            return 0;
        }
        
        // mark cuurent cell as visted
        visited[row][col] = true;
        
        // calculate perimeter in all four directions, do not add one here since we are return 1 from the base case if it is water.
        int count = getPerimeterDFS(grid, visited, row + 1, col)
                  + getPerimeterDFS(grid, visited, row - 1, col)
                  + getPerimeterDFS(grid, visited, row, col - 1)
                  + getPerimeterDFS(grid, visited, row, col + 1);
        
        //return the perimeter
        return count;
    }
} 