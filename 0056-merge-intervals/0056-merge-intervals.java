class Solution {
    public int[][] merge(int[][] a) {
        
        Arrays.sort(a,(c,b) -> c[0]-b[0]);

        List<int []> arr = new ArrayList();

        int s=a[0][0];
        int e = a[0][1];

        for(int i=1;i<a.length;i++){

            if(e >= a[i][0]){
               e= Math.max(e,a[i][1]);
            }
            else{
            arr.add(new int[]{s,e});
            s=a[i][0];e=a[i][1];
            }
        }
        arr.add(new int[]{s,e});
        return arr.toArray(new int[arr.size()][]);
    }
}