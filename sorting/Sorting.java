import java.util.Scanner;

class Sorting
{
	//Bubble sort
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
	
	//Selection Sort
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
	
	// Insertion Sort
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
	
	// Quick Sort
	int partition(int[] arr, int low, int high)
	{
		int sorted = arr[low];
		int last = high + 1;
		for ( int i = high ; i != 0 ; i -- )
		{
			if(arr[i] > sorted)
			{
				last--;
				int temp = arr[last];
				arr[last] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[last - 1];
		arr[last - 1] = sorted;
		arr[low] = temp;
		
		return last - 1;
	}
	
	void quickSort(int[] arr, int low, int high)
	{
		if(low < high)
		{
			int center = partition(arr, low, high);
			
			quickSort(arr,low, center-1);
			quickSort(arr, center+1, high);
		}
	}
	
	// Merge Sort
	void mergeSort(int[] arr)
	{
		
	}
	
	// main function
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
							+ "4.Quick sort\n"
							+ "5.Merge sort\n"
							+ "6.Heap sort\n"
							+ "7.Count sort\n"
			                                + "8.Exit");
			
			int option = scan.nextInt();
			if(option == 8)
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
				case 4: sort.quickSort(arr, 0 , n-1);
				            for ( int i = 0 ; i < arr.length; i++)
						System.out.println(arr[i]);
		                            System.out.println();
				break;
				case 5: sort.mergeSort(arr);
				default : System.out.println("Invalid choice");
				break;
			}
		}
		
	}
}