class Solution {
    public void reverse(int a[] , int s, int e){
        while(s<e){
            int temp=a[e];
            a[e]= a[s];
            a[s] = temp;
            s++;
            e--;

        }
    
    }
    public void rotate(int[] nums, int k) {
        int n= nums.length;
         k=k%nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}