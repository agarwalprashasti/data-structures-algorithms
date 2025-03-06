class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            int comp = target-nums[i];
            if(hm.containsKey(comp)){
                return new int[]{i, hm.get(comp)};
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}