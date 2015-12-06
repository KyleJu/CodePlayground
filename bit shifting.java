public class Solution {
// problem one : n = n>>1;
// problem 2: treat n as an unsgined and someitmes it will return -1;
// char '1' is 49 !!!! use it carefullly!!!!!!!!
// '' for char

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if (n == 0) return 0;
        int counter = 1;
        int sum = 0;
        while (counter <= 32) {
            sum = sum + Math.abs(n%2);
             n = n>>1;
             counter++;
        }
        return sum ;
    }
}