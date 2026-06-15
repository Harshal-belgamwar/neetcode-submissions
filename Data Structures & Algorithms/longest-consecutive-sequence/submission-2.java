class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        int minElement =Arrays.stream(nums).min().getAsInt();
        int maxElement = Arrays.stream(nums).max().getAsInt();

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int count=0,maxCount=0;
        System.out.println(minElement+" "+maxElement);

        for(int i=minElement;i<=maxElement;i++){
            
            if(set.contains(i)){
                count++;
            }else{
                maxCount = Math.max(maxCount,count);
                count=0;
            }

        }
        maxCount = Math.max(maxCount,count);
        return maxCount;

        
    }
}
