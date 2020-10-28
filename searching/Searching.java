import java.util.Scanner;

class Searching
{
	// Linear search
	int linearSearch(int[] arr, int search)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == search)
				return i ;
		}
		return -1;
	}
	
	// Binary search
	int binarySearch(int[] arr, int left, int right, int element)
	{
		if(left <= right)
		{
			int mid = left + (right - left) / 2;
			if(arr[mid] == element)
				return mid;
			if(arr[mid] > element)
				return binarySearch(arr, left, mid - 1, element);
			return binarySearch(arr, mid + 1, right, element);
		}
		return -1;
	}
	
	void result(int index)
	{
		if(index == -1)
			System.out.println("Not Found!");
		else
			System.out.println("Element found at index " + index);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Searching search = new Searching();
		while(true)
		{
			System.out.println("\nChose one search option : ");
			System.out.println("1.Linear Search\n"
						       + "2.Binary Search\n"
			                               + "3.Exit");
			int choice = scan.nextInt();
			if(choice == 3)
				System.exit(0);
			
			System.out.print("Enter Size of the Array : ");
			int size = scan.nextInt();
			int[] arr = new int[size];
			System.out.println("\nEnter array elements (Sorted for Binary Search) : ");
			for(int i = 0 ; i < size ; i++)
				arr[i] = scan.nextInt();
			System.out.println("Enter Search element : ");
			int element = scan.nextInt();
			switch(choice)
			{
				case 1: search.result(search.linearSearch(arr, element));
				break;
				case 2: search.result(search.binarySearch(arr, 0, arr.length - 1, element));
				break;
				default: System.out.println("Invalid");
				break;
			}
		}
	}
}