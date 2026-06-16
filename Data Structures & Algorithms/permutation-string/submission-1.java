class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[]str = s1.toCharArray();
        Arrays.sort(str);
        String nstr = new String(str);

        for(int i=0;i<=s2.length()-s1.length();i++){
            String sub = s2.substring(i,i+s1.length());

            char[]sub1 = sub.toCharArray();
            Arrays.sort(sub1);
            String nsub = new String(sub1);

            if(nsub.equals(nstr)) return true;
        }

        return false;
        
    }
}
