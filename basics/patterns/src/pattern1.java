public class pattern1 {
    public static void main(String[] args) {

        int k = 0, n = 4;
        boolean flip = false;

        while (k <= (2 * n + 1) && k >= 0) {

            for (int i = 0; i <= (n - k); i++) {
                System.out.print("*");
            }

            for (int i = 0; i < (2 * k - 1); i++) {
                System.out.print(" ");
            }

            for (int i = 0; i <= (n - k); i++) {
                if (!(i == n - k && (k == 0 || k == (2 * n + 1)))) {
                    System.out.print("*");
                }
            }


            if (k >= n || flip) {
                k--;
                flip = true;
            } else {
                k++;
            }
            System.out.println();
        }
    }

    /*

n=4

    *********
    **** ****
    ***   ***
    **     **
    *       *
    **     **
    ***   ***
    **** ****
    *********

     */
}
