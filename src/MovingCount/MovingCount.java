package MovingCount;

class Solution {
    public int movingCount(int m, int n, int k) {
        boolean[][]visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);

    }
    public int dfs(int i, int j, int m, int n, int k, boolean[][] visited){
        if(i >= m || j>= n || k < getSum(i) + getSum(j) || visited[i][j]){
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i +1, j, m, n, k, visited) + dfs(i, j+1, m, n, k, visited);
    }
    private int getSum(int a){
        int sum = a % 10;
        int tmp = a / 10;
        while(tmp > 0){
            sum += tmp % 10;
            tmp /= 10;
        }
        return sum;
    }
}
public static void main (String args[]) {
	
}
