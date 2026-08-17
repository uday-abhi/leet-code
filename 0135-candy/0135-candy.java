class Solution {
    public int candy(int[] a) {

        int ans=0;
        int n= a.length;
        int l[] = new int[n];
          int r[] = new int[n];   
          int c=1;
        l[0]=1;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                c++;
                l[i] = c;
            }
            else{
                c=1;
                l[i]=c;
            }

        }
        r[n-1]=1;
        int cc=1;
         for(int i=n-2;i>=0;i--){
            if(a[i]>a[i+1]){
                cc++;
                r[i] = cc;
            
            }
            else{
                cc=1;
                r[i]=cc;
            }

        }
        for(int i=0;i<n;i++){
            ans += Math.max(l[i],r[i]);
        }
        return ans;
    }
}