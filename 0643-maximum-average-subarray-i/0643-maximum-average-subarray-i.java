class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length, max_sum= Integer.MIN_VALUE;
        for(int i=0;i<=(n-k);i++){
            int sum=0;
            for(int j=i;j<(i+k);j++){
                sum+=nums[j];
            }
            max_sum = Math.max(max_sum, sum);
        }
        return (double) max_sum/k;
    }
}