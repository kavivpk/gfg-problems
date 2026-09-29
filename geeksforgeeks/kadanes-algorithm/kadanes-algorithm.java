class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int cur=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if(cur>max){
                max=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return max;
    }
}
