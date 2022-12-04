import java.util.Scanner;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int l;
		System.out.println("Enter number of Elements");
		int N = scan.nextInt();
		int arr[]= new int[N];
		System.out.println("Enter Elements of array");
		for(int i=0;i<N;i++)
		{
			arr[i]=scan.nextInt();
		}

		//call function to find length of subsequence array

		l=longestconsecutive(arr,N);

		System.out.println("Length of longest Consecutive subsequence is: "+l);
	}

	// Function to find Longest Consecutive Subsequence of array

	public static int longestconsecutive(int x[],int n)
	{

		// call function to Sort the given array in ascending order

		x=sort(x);

		// initialize the length and count as 0

		int length=0;
		int count = 0;

		for(int i=0;i<n;i++)
		{

			// counting the length of longest subsequence of array

			if(i>0&&x[i]==x[i-1]+1)
			{
				count=count+1;
			}

			// skip count if current element equal to previous element

			else if(i>0&&x[i]==x[i-1])
			{
				continue;
			}

			// Resetting count to next consecutive sequence.

			else
			{
				count = 1;

			}

			// Maximum length of consecutive sequences in an array

			length = max(length,count);

		}


		return length;
	}

	// Function to find Maximum of Two number

	public static int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

	// Function to Sort the element of given array

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
