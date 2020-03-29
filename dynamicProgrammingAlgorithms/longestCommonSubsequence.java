
// This one uses recursion
class Solution{
    int lcs(char[] X, char[] Y, int m, int n){
        if(m == 0 || n == 0) return 0;
        else if(X[m-1] == Y[n-1]) return 1 + lcs(X, Y, m-1, n-1);
        else return Math.max(lcs(X, Y, m-1, n), lcs(X, Y, m, n-1));
    }
}

// This one uses Dynamic Programming
class Solution1{
    int lcs(char[] X, char[] Y, int m, int n){
        int[][] array = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j<= n; j++){
                if(i == 0 || j == 0) array[i][j] = 0;
                else if(X[i-1] == Y[j-1]) array[i][j] = 1 + array[i-1][j-1];
                else array[i][j] = Math.max(array[i - 1][j], array[i][j - 1]);
            }
        }
        return array[m][n];
    }
}