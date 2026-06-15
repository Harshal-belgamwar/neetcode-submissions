class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        


        for(int i=0;i<strs.length;i++){
            // int sum = 0;
            // for(int j=0;j<strs[i].length();j++){
            //     if(strs[i].charAt(j) == 'a'){
            //         sum+=26;
            //     }
            //     sum+=strs[i].charAt(j)-'a'+1;
            // }

            char[]arr= strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            map.putIfAbsent(sorted,new ArrayList<String>());
            map.get(sorted).add(strs[i]);
        }

        List<List<String>> ans = new ArrayList<>();

        for(String it:map.keySet()){
            ans.add(map.get(it));
        }

        return ans;
        
    }
}
