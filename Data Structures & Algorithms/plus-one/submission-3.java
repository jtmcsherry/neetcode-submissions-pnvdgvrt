class Solution {
    public int[] plusOne(int[] digits) {
        int position = digits.length - 1;
        while (position >= 0) {
            if (digits[position] != 9){
            digits[position]++;
                return digits;
            } else{
                digits[position] = 0;
                position--;
            }
        }
        int[] array = new int[digits.length + 1];
        array[0] = 1;
        return array;    
    }
}
