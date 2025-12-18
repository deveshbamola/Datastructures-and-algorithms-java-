import java.util.*;
public class Insertion_sort
{
        public static void main(String args[])
        {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of array ->");
        int n = s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements ->");
        for (int i =0 ;i<n;i++)
        {
                a[i]=s.nextInt();
        }
        for(int i =0 ; i < n;i++)
        {
		int j=i-1;
		int key = a[i];
		while(j>=0&&key<a[j])
		{
			a[j+1]=a[j];
			j--;
		}
	a[j+1]=key;
	}
	for(int i=0;i<n;i++)
        {
                System.out.print(a[i]+" " );
        }

	}
}
