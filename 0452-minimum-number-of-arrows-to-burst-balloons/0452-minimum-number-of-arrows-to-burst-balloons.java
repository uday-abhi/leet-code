class Solution {
    public int findMinArrowShots(int[][] a) {

        Arrays.sort(a,(x,y) -> Integer.compare(x[1],y[1]));
        long range = (long)a[0][1];
    int c=1;

        for(int i=1;i<a.length;i++){

            if(range < a[i][0]){
                c++;
                range = a[i][1];
            }
        }
        return c;
    }
}