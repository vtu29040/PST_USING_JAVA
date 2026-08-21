class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n/2;
        int left = 0;
        int right = mid;
        int count1 = 0;
        int count2 = 0;
        s = s.toLowerCase();
        while(left < mid){
            if(s.charAt(left) == 'a'
            || s.charAt(left) == 'e'
            || s.charAt(left) == 'i'
            || s.charAt(left) == 'o'
            || s.charAt(left) == 'u'){
                count1++;
            }
            if(s.charAt(right) == 'a'
            || s.charAt(right) == 'e'
            || s.charAt(right) == 'i'
            || s.charAt(right) == 'o'
            || s.charAt(right) == 'u'){
                count2++;
            }
            left++;
            right++;
        }
        return count1 == count2;
    }
}