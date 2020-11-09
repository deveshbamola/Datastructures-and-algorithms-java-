class Bubble
{
	static void sort(int[] arr) 
	{
		for(int i = 0 ; i < 7 ; i++)
		{
			for(int j = 0 ; j < 6 - i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {9,5,3,7,1,0,4};
		Bubble.sort(arr);
		for(int n:arr)
			System.out.print(n + " ");
	}
}