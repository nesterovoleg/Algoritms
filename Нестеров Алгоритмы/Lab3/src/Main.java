import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,n = 0;
        long firstNumberFactorial,secondNumberFactorial;

        Scanner scanner = new Scanner(System.in);
        Factorial factorial = new Factorial();
        Fibonacci fibonacci = new Fibonacci();
        SumDigits sumDigits = new SumDigits();
        SumNoUsingPlus sumNoUsingPlus = new SumNoUsingPlus();

        System.out.println("Please enter a number for calculating its factorial:");
        int c  = scanner.nextInt();
        firstNumberFactorial = factorial.cycleExecute(c);
        secondNumberFactorial = factorial.recursionExecute(c);
        assert (firstNumberFactorial == secondNumberFactorial);
        System.out.println("Factorial search result with number " + c + " by using cycle = " + firstNumberFactorial);


        System.out.println("Please enter number for calculations fibonacci.");
        n = scanner.nextInt();
        a = fibonacci.cycleExecute(n);
        b = fibonacci.recursionExecute(n);
        assert (a == b);
        System.out.println("Fibonacci search result with number " + n + " by using recursion = " + b);



        System.out.println("Number for calculations sum digits enter number.");
        n = scanner.nextInt();
        System.out.println("Number n = "+ n + "\nSum digits = " + sumDigits.execute(n));


        System.out.println("For calculations, the number for calculating sum of all possible numbers without plus is enter two digits.");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Number a = " + a + "\nNumber b = " + b + "\nSum of numbers without plus = " + sumNoUsingPlus.execute(a,b));

    }
}