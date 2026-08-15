class Solution {
    public int[] numberGame(int[] nums) {
        int [] arr = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int n =0;
        while(!pq.isEmpty()){
            int a= pq.poll();
            int b=pq.poll();
            arr[n]=b;
            arr[n+1]=a;
            n +=2;
        }
        return arr;
    }
}