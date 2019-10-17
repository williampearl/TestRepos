public class Main {
    public static void main(String[] args){
        FastFibonacci fib = new FastFibonacci();
        for(int i=0; i<200; i++)
            System.out.println(fib.fib(i));
    }
}
