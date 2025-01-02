class Solution {
  public int maxIncreaseKeepingSkyline(int[][] grid) {
    int n = grid.length;
    int[] row, col;
    row = new int[n];
    col = new int[n];

    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        row[i] = Math.max(grid[i][j], row[i]);
        col[i] = Math.max(grid[j][i], col[i]);
      }
    }

    int ans = 0;
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        ans += Math.min(row[i], col[j]) - grid[i][j];
      }
    }

    return ans;

  }
}
