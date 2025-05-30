class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(n);

        while(true){
            int sum = 0;
            while(n != 0){
                sum = sum + (int)Math.pow(n % 10,2);
                n = n/10;
            }
            n = sum;
            if(sum == 1){
                return(true);
            }
            if(list.contains(sum)){
                return(false);
            }
            else{
                list.add(sum);
            }
        }
    }
}
