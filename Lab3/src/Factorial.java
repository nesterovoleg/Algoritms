public class Factorial {

    public long recursionExecute(long n){
        if (n < 2)
                return 1;
        return recursionExecute(n-1)*n;
    }

    public long cycleExecute(int n){
        long result=1;
        for (int i=1; i<=n; i++){
            result=result*i;
        }
        return result;
    }

}
