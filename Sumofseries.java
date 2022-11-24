//SUM OF SERIES FROM 1+2+3+4....N    

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        long sum=0;
        sum=((long)n*(long)(n+1))/2;
        return sum;
    }
}
