public class pattern2 {
    public static void main(String[] args) {

        int k = 0, n = 4;
        boolean flip = false;

        while (k <= (2 * n + 1) && k >= 0) {

            for (int i = 0; i <=k; i++) {
                System.out.print("*");
            }

            for (int i = 2*k; i < (2 * n + 1); i++) {
                    System.out.print(" ");
            }

            for (int i = 0; i <=k; i++) {
                    System.out.print("*");
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

     *         *
     **       **
     ***     ***
     ****   ****
     ***** *****
     ****   ****
     ***     ***
     **       **
     *         *

     */
}
