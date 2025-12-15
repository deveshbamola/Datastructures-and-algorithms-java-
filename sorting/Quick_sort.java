import java.util.*;
public class Quick_sort
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
	sort(a,0,n-1);
	for(int i=0;i<n;i++)
        {
                System.out.print(a[i]+" " );
        }

	}
	public static void sort (int arr[], int l , int h)
	{
		if(l<h)
		{
			int pos = partition(arr,l,h);
		       	sort(arr,l,pos-1);
			sort(arr,pos+1,h);	
		}

	}
	public static int partition(int arr[], int l , int h)
	{
		int pivot = arr[l];
		int i=l;
		int j=h;
		
		while(i<j)
		{
			while(arr[i]<=pivot){
				i++;
			}

                        while(arr[j]>pivot){
                                j--;
                        }
			if(i<j){
			int t = arr[i];
			arr[i]= arr[j];
			arr[j]=t;}
		}
		int temp=arr[l];
		arr[l]=arr[j];
		arr[j]=temp;
		return j;
	}

}


