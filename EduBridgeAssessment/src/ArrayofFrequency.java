import java.util.Scanner;

public class ArrayofFrequency {
	static int x;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of Test Cases");
		int T = scan.nextInt();

		// Loop for number of Test Cases to be run

		for(int t=0;t<T;t++)
		{
			x=0;
			System.out.println("Enter number of array Elements");
			int N = scan.nextInt();
			int arr[]= new int[N];
			int arr2[][] = new int[arr.length][2];
			System.out.println("Enter Elements of array");
			for(int i=0;i<N;i++)
			{
				arr[i]=scan.nextInt();
			}

			// calling function to sort given array

			arr=sort(arr);

			// counting elements with high frequency

			arr2[x][0] = arr[0];

			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]==arr[i-1])
				{
					arr2[x][1]=arr2[x][1]+1;
				}
				else {
					x++;
					arr2[x][0]=arr[i];
				}
			}
			x++;

			// calling function to sort the sorted array in high frequency	

			arr2=sort2(arr2);

			for(int i=0;i<x;i++)
			{
				for(int j=0;j<=arr2[i][1];j++)
				{
					System.out.print(arr2[i][0]+" ");
				}
			}
			System.out.println("");
		}
	}

	// compare and Sort 2 dimension array

	public static int[][] sort2(int b[][])
	{
		int c[] = new int[2];

		for(int i=0;i<x;i++)
		{
			for(int j=i;j<x;j++)
			{
					if(b[i][1]<b[j][1])
					{
						c = b[i];
						b[i] = b[j];
						b[j] = c;
					}
					
			}
		}
		return b;
	}

	// compare and sort single dimension array

	public static int[] sort(int a[]) {
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}

}
