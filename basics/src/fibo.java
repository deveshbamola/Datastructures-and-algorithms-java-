public class fibo {
    public static void main(String[] args) {
        System.out.println(fibo(4));
        printFibonacci(5);
    }

    public static int fibo(int n){
        if(n<=1){
            return n;
        }

        int first = fibo(n-2);
        int second= fibo(n-1);

        return first+second;
    }

    static int a = 0, b = 1;

    public static void printFibonacci(int n) {
        if (n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + " ");

        a = b;
        b = c;

        printFibonacci(n - 1);
    }
}
