class Solution {
    public int maxProfit(int[] a) {
        
        int l=a[0];
        int ans=0;
        for(int i=1;i<a.length;i++){
            ans=Math.max(a[i]-l,ans);
            l=Math.min(a[i],l);
        }
        return ans;
    }
}