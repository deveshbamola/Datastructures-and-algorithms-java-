public class pattern4 {
    public static void main(String[] args) {
        int n=4;

        for (int i = 0; i <2*n-1; i++) {
            for (int j = 0; j <2*n-1; j++) {
                int top = i, left = j, right=2*n-j-2, bottom=2*n-i-2;

                //intution: calculate distance between top,left, right, bottom from the position cursor is on
                System.out.print(n - Math.min(Math.min(top,bottom), Math.min(left,right))+" ");
            }
            System.out.println();
        }
    }
}

/*

n= 4

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
 */