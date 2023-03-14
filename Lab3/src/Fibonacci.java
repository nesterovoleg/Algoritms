public class Fibonacci {
    public int recursionExecute(int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return recursionExecute(n-1)+recursionExecute(n-2);
    }

    public int cycleExecute(int n) {
        int j=0,k=1;

        for (int i = 2; i <= n; ++i) {
            int number=j+k;
            j=k;
            k=number;
        }
        return k;
    }
}
