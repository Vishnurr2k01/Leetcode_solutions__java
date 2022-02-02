

// https://leetcode.com/problems/count-primes/
// Count Primes
// solved using seieve eritosthenos principle


class countPrimes {
    public int countPrimes(int n) {
     
       int[] arr = new int[n+1];
        if(n==0){
            return 0;
        }
        
       for(int i=0;i<n;i++){
           arr[i]=1;
       }
        
        arr[0]=0;
        arr[1]=0;
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                for(int j=2;i*j<n;j++){
                    arr[i*j]=0;
                }
                count++;
            }
        }
        return count;
        
    }
}