import java.util.Arrays;

public class primeNumber {
    public static void main(String[] args) {
        boolean[] prime = new boolean[100 + 1];

        primeNumber(prime);

        for (int i = 1; i < prime.length; i++) {
            if (prime[i]) System.out.print(i + " ");
        }
    }


    // Sieve of Eratosthenes
    public static void primeNumber(boolean[] prime) {

        Arrays.fill(prime, true);

        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }
    }
}
