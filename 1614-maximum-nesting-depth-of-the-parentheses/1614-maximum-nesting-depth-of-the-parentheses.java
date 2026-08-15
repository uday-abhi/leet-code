class Solution {
    public int maxDepth(String ss) {
        Stack<Character> s = new Stack<>();
        int c =0,ans =0;
        for(int i=0;i<ss.length();i++){
            char ch=ss.charAt(i);
            if(ch == '('){
                s.push(ch);
                c++;
            }
            else if(ch == ')'){
                s.pop();
                c--;
            }

            ans = Math.max(ans,c);
        }
        return ans;
    }
}