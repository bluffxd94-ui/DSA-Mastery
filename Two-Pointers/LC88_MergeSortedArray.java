class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m){

        int total = n+m;
        int[] arr = new int [total];
        int id = 0;
        int left = 0;
        int right = 0;

        while(left < n && right < m){
            if(nums1[left] <= nums2[right]){
                arr[id] = nums1[left];
                left++;
                id++;
            }else{
                arr[id] = nums2[right];
                right++;
                id++;
            }
        }
        while(left < n){
            arr[id] = nums1[left];
            left++;
            id++;
        }
        while(right < m){
            arr[id] = nums2[right];
            id++;
            right++;
        }

        for(int i = 0; i < total; i++) {
            nums1[i] = arr[i];
        }
    }
}