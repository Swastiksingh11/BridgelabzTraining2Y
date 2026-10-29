class Solution {
    public double myPow(double x, int n) {
        Double power=1.00;
        for(int i=1;i<=n;i++){
            power=power*x;
        }
        return power;
    }

    public static void main(String[] args) {
        Solution s1=new Solution();
        System.out.println( s1.myPow(10,2));
    }
}