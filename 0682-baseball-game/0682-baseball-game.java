class Solution {
    public int calPoints(String[] arr) {
        
        Stack<Integer> st = new Stack<>();

        for(String s:arr){
           

            if(s.equals("+")){
                int a= st.pop();
                int b =st.peek();
                int sum= a+b;
                st.push(a);
                st.push(sum);
            }

            else if(s.equals("D"))
                st.push(st.peek()*2);

          else if(s.equals("C")) st.pop();

          else {
             int x= Integer.valueOf(s);
                st.push(x);
          }
        }
            int ans=0;
            while(!st.isEmpty()){
                ans += st.pop();
            }

            return ans;
    }
}