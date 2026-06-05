class Solution {
    public int removeDuplicates(int[] nums) {
        //Firstly we instalize things
        int off = 0;
        int unq = 1;
        int cm = 1;

        int n = nums.length;
        nums[0] = nums[off];
        while(cm < n){
            if(nums[cm] == nums[cm -1]){

                cm++;
                continue;
            }
            //Here the unique element process takes place
            nums[off + 1] = nums[cm];
            cm++;
            off++;
            unq++;
        }
        return unq;
        
    }
}