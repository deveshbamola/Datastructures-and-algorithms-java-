import java.util.*;

public class selection_sort
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
        for(int i =0 ; i < n-1;i++)
        {       int min_index = i;

                for(int j=i+1;j<n;j++){
			if(a[j]<a[min_index])
			{
				min_index=j;
			}
		}
		int t=a[min_index];
		a[min_index]=a[i];
		a[i]=t;
	}
	for(int i=0;i<n;i++)
        {
                System.out.print(a[i]+" " );
        }

	}
}
