class Solution {
    public java.util.ArrayList<java.util.ArrayList<Integer>> searchWord(char[][] grid, String word) {
        int n = grid.length;
        int m = grid[0].length;
        int len = word.length();

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        java.util.ArrayList<java.util.ArrayList<Integer>> res = new java.util.ArrayList<>();

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (grid[r][c] != word.charAt(0)) {
                    continue;
                }

                boolean found = false;
                for (int dir = 0; dir < 8; dir++) {
                    int currR = r;
                    int currC = c;
                    int k = 0;

                    while (k < len) {
                        if (currR < 0 || currR >= n || currC < 0 || currC >= m) {
                            break;
                        }
                        if (grid[currR][currC] != word.charAt(k)) {
                            break;
                        }
                        currR += dx[dir];
                        currC += dy[dir];
                        k++;
                    }

                    if (k == len) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    java.util.ArrayList<Integer> coord = new java.util.ArrayList<>();
                    coord.add(r);
                    coord.add(c);
                    res.add(coord);
                }
            }
        }

        return res;
    }
}