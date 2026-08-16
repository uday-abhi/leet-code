class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c1 = 0 , c2 = 0;

        for(int i:bills){
            if(i==5){
                c1++;
            }
            else if(i==10){
                if(c1>0){
                    c2++;
                    c1--;
                }
                else{
                    return false;
                }
            }
            else{
                if(c1>0 && c2>0){
                    c1--;c2--;
                }
                else if(c1>2){
                    c1 = c1-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}