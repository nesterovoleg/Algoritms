public class SumNoUsingPlus {
    public int execute(int a, int b){
        if(b==0)
            return a;
        return  execute(++a,--b);
    }
}
