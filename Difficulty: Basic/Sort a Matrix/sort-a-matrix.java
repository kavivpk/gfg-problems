class Solution {
    int[][] sortedMatrix(int mat[][]) {
        // code here
        int n=mat.length;
        int arr[]=new int[n*n];
        int k=0;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[k]=mat[i][j];
                k++;
            }
        }
        
        Arrays.sort(arr);
        k=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=arr[k];
                k++;
            }
        }
        
        return mat;
    }
}