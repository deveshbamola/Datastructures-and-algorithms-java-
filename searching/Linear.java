import java.util.*;
class Linear{
	 public static void main(String args[])
    {
        int arr[] = { 7,3, 4, 1, 44 };
        int n = arr.length;
	int search = 5,result=0;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == search)
                result=1;break;
        }
	if(result!=1)
		System.out.println("not found");
	else
		System.out.println("found");
    }

}
