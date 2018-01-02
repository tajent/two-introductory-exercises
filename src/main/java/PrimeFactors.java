import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public void generate(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++){
            if (n % i == 0 && isPrime(i)) {
                factors.add(i);
                n /= i;
            }
        }
        System.out.println(factors);
    }

    boolean isPrime(int n) {
        if (n != 2 && n!=3 && (n%2==0 || n%3==0)) {
            return false;
        }
        return true;
    }
}
