import java.util.Scanner;

class Sorting
{
	void bubbleSort(int[] arr)
	{
		int length = arr.length;
		for(int i = 0 ; i < length-1 ; i++)
		{
			for(int j = 0 ; j < length -1 - i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		
		}
		for ( int i = 0 ; i < length; i++)
			System.out.println(arr[i]);
		System.out.println();
	}
	
	void selectionSort(int[] arr)
	{
		int length = arr.length;
		for (int i = 0 ; i < length; i++)
		{
			int min = arr[i];
			for(int j = i ; j < length ; j++)
			{
				if(arr[j] < min)
				{
					arr[i] = arr[j];
					arr[j] = min;
					min = arr[i];
				}
			}
		}
		for ( int i = 0 ; i < length; i++)
			System.out.println(arr[i]);
		System.out.println();
	}
	
	void insertionSort(int[] arr)
	{
		int length = arr.length;
		for(int i = 1 ; i < length ; i++)
		{
			int key = arr[i];
			int j;
			for(j = i-1; j >=0 ; j--)
			{
				if(arr[j] > key)
					arr[j+1] = arr[j];
				else
					break;
			}
			arr[j+1] = key;
		}
		for ( int i = 0 ; i < length; i++)
			System.out.println(arr[i]);
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Sorting sort = new Sorting();
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Option for sorting, chose one \n" 
							+ "1.Bubble sort\n"
							+ "2.Selection sort\n"
							+ "3.Insertion sort\n"
			                                + "4.Exit");
			
			int option = scan.nextInt();
			if(option == 4)
				System.exit(0);
			
			System.out.print("Enter the size of the array : ");
			int n = scan.nextInt();
			int[] arr = new int[n];
			System.out.println("\nEnter all required elements : ");
			for (int i = 0 ; i < n; i++)
				arr[i] = scan.nextInt();
			System.out.println("\nSorted array :");
			switch(option)
			{
				case 1: sort.bubbleSort(arr);
				break;
				case 2: sort.selectionSort(arr);
				break;
				case 3: sort.insertionSort(arr);
				break;
				default : System.out.println("Invalid choice");
				break;
			}
		}
		
	}
}