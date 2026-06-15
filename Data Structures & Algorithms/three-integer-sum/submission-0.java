class Solution {
    public List<List<Integer>> threeSum(int[] nums) {



        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            HashSet<Integer>mapset = new HashSet<>();

            for(int j=i+1;j<nums.length;j++){
                int third = -(nums[i]+nums[j]);

                if(mapset.contains(third)){
                    List<Integer> ans =Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(ans);
                    set.add(ans);
                }

                mapset.add(nums[j]);
            }
        }

        return new ArrayList<>(set);








        
    }
}
