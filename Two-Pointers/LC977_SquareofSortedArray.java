class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0;
        int right = n -1;
        int p = n -1; // this points to the last index of the array.

        while(left <= right){
             int leftsquare = arr[left] * arr[left];
             int rightsquare = arr[right] * arr[right];

            if(leftsquare> rightsquare){
                result[p] = leftsquare;
                left++;
            }else{
                result[p] = rightsquare ;
                right--;
            }
             p--;
        }
        return result;
    }
}