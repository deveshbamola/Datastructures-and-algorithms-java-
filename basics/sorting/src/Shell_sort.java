import java.util.*;
public class Shell_sort
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
//	int gap=(n-1)/2;
	for(int  gap = n/2;gap>0;gap=gap/2)
	{
		for(int i=gap;i<n;i++)
		{
			for(int j=i-gap;j>=0;j=j-gap)
			{
				if(a[j]<a[j+gap])
					break;
				else
				{
					int temp=a[j];
					a[j]=a[j+gap];
					a[j+gap]=temp;
				}
			}

		}
	}
	 for(int i=0;i<n;i++)
        {
                System.out.print(a[i]+" " );
        }

	}}
