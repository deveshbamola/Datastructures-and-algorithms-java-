class Selection
{
	static void sort(int[] arr)
	{
		for (int i = 0 ; i < 8; i++)
		{
			int min = arr[i];
			for(int j = i ; j < 8 ; j++)
			{
				if(arr[j] < min)
				{
					arr[i] = arr[j];
					arr[j] = min;
					min = arr[i];
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {3,7,0,9,1,2,6,7};
		Selection.sort(arr);
		for(int n : arr)
			System.out.print(n + " ");
	}
}