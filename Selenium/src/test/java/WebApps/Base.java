package WebApps;

import java.util.Arrays;

public class Base {
	
	public static void main(String args[])
	{
		String str = "afvgbajbgbf";
		String rev = "";
		int number = 103301;
		int result = 0;
		
		for(int i=str.length()-1; i>=0 ;i--)
		{
				rev += str.charAt(i); 
		}
		
		int numb=number;
		while (number>0)
		{
			int n = number%10;
			number = number/10;
			result = (result*10) + n;
		}
		
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Pallindrome");
		}
		else
			System.out.println("Not Pallindrome");
		

		if(numb==result)
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
		
		
		int a[] = {1,2,2,3,4,4,5,5,6,7};
		//int b[] =new int[a.length];
		//int c[] = new int[a.length];
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.print(a[j]);
				/*else if(a[i]!=a[j])
					System.out.println();
					System.out.print(a[j]);
		*/	}
		}

		int n=11;
		int flag=0;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				flag = 1;
				break;
			}
			else
				flag=0;
		}
		if(flag ==0)
		{
			System.out.print("prime");
		}
		//System.out.println(Arrays.toString(c));
		
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
		
	}
}