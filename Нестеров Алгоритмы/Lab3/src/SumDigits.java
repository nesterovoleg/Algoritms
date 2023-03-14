public class SumDigits {

    public int execute(int n){
        if(n<10)
            return n;

        return (n%10)+execute(n/10);
    }

}
