class Count
{
	static void sort(int[] arr)
	{
		int max = arr[0];
		
		for(int i = 0 ; i < 8 ; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		
		int[] count = new int[max + 1];
		int[] output = new int[8];
		
		for(int i = 0 ; i < 8 ; i++)
			count[arr[i]]++;
		
		for(int i = 1 ; i <= max ; i++)
			count[i] += count[i-1];
		
		for(int i = 7 ; i>=0; i--)
		{
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
		for ( int i = 0 ; i < 8 ; i++)
			arr[i] = output[i];
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,3,6,0,4,2,6,9};
		Count.sort(arr);
		for(int n: arr)
			System.out.print(n + " ");
	}
}