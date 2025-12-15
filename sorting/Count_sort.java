import java.util.*;
public class Count_sort
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
	 int max = a[0];

         // Traverse array elements from second and
         // compare every element with current max
         for (int i = 1; i < a.length; i++)
             if (a[i] > max)
                 max = a[i];
	int count[]=new int[max+1];
        for(int i =0 ; i < max+1;i++)
        {
		count[i]=0;
	}
	for(int i =0 ; i < a.length;i++)
        {
                count[a[i]]++;
        }
	for(int i =1 ; i < max+1;i++)
        {
                count[i]+=count[i-1];
        }
	int output[]=new int[a.length];
	for(int i =0 ; i < a.length;i++)
        {
                output[--count[a[i]]]=a[i];
        }
	
	 for(int i=0;i<n;i++)
        {
                System.out.print(output[i]+" " );
        }
	}

}




