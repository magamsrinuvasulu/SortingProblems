class LeetCode2148 {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int smaller=nums[0];
        int greater=nums[nums.length-1];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>smaller&&nums[i]<greater)
            count++;
        }
        return count;
    }
}