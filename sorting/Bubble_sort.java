import java.util.*;
public class Bubble_sort
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
	{
		for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
		}
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" " );
	}

		}
	}

