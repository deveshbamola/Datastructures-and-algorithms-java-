import java.util.*;

public class Merge_sort
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
        Mergsort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
                System.out.print(a[i]+" " );
        }

        }
        public static void Mergsort (int arr[], int l , int h)
        {
                if(l<h)
                {
			int mid =(l+(h))/2;
                        Mergsort(arr,l,mid);
			Mergsort(arr,mid+1,h);
			Merge( arr,l ,mid ,h);			
		}

        }
        public static void Merge(int arr[], int l , int mid,int h)
        {
               
                int n1=mid-l+1;
                int n2=h-mid;
		int ls[]=new int[n1];
		int rs[]=new int[n2];
		for(int i =0;i<n1;i++)
		{	
			ls[i]=arr[l+i];

		}
		 for(int j =0;j<n2;j++)
                {
                        rs[j]=arr[mid+1+j];

                }
		int k=l;
		int i=0,j=0;
                while(i<n1&&j<n2)
                {
                        if(ls[i]<rs[j])
			{
				arr[k]=ls[i];
			i++;	
			}
			else
			{
				arr[k]=rs[j];
			j++;
			}
			k++;
                }
                while(i<n1)
		{
			arr[k]=ls[i];
			i++;
			k++;
		}
		while(i<n1)
                {
                        arr[k]=rs[j];
			j++;
			k++;

                }

        }
}
