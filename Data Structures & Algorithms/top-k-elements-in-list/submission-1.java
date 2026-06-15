class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        
        int start=0,end=0;
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->b[1]-a[1]);

        while(end<nums.length){
            if(nums[start]!=nums[end]){
                int freq = end-start;

                pq.offer(new int[]{nums[start],freq});
                start = end;

            }
            end++;
        }
        int freq = end-start;

        pq.offer(new int[]{nums[start],freq});

        int[]ans = new int[k];
        int index=0;

        while(!pq.isEmpty() && k>0){

            int[]pair = pq.peek();
            pq.poll();

            ans[index++] = pair[0];
            k--; 

        }
        return ans;


    }
}
