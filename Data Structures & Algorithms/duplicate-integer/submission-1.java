class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for(int i: nums){
            if(set.contains(i)==false)
                set.add(i);
            else
                return true;
        }
        return false;
    }
}