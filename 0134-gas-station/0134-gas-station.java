class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int g=0,c=0;

        for(int i=0;i<gas.length;i++){
            g += gas[i];
            c += cost[i];
        }

        if(g<c) return -1;

        int s=0,gs=0;

         for(int i=0;i<gas.length;i++){
            gs += gas[i]-cost[i];

            if(gs<0){
                s = i+1;
                gs=0;
            }
        }
        return s;
    }
}