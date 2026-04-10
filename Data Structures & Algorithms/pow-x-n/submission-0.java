class Solution {
    public double myPow(double x, int n) {
        double value = x;
        if (n > 0){
            for (int i = 0; i < n - 1; i++){
                value = value * x;
            }
        } else {
            n = n * -1;
            for (int i = 0; i <= n; i++){
                value = value * (1/x);
            }
        }

        return value;
    }
}
