class Calculator{
    
    static int power(int n,int p) throws Exception {
        if(n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        if(p==0) return 1;
        int result = n;
        for(int i = 1; i < p; i++){
            result *= n;
        }
        return result;
    }    
    
    
} 


