import java.lang.reflect.Array;
import java.util.ArrayList;
public class FastFibonacci {
    private ArrayList<Long> numbers;
    public FastFibonacci() {
        numbers = new ArrayList<>();
        numbers.add(1l);
        numbers.add(1l);
    }
    public long fib(int n) {
        if(n < numbers.size())
            return numbers.get(n);
        long hold = fib(n-1) + fib(n-2);
        numbers.add(hold);
        return hold;
    }
}
