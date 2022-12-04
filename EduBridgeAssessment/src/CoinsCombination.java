import java.util.Scanner;

public class CoinsCombination {

	public static void main(String[] args) {
		
		int coins[] = {1,2,3};
		int N = coins.length;
		int sum = 4;
		System.out.println("No of Possible ways are:"+sumofcoinssequence(coins,sum,N));
	}
	
	public static int sumofcoinssequence(int[] coins, int sum, int n) {
	      
	      
	    	int[][] arr = new int[n + 1][sum + 1];
	    	
	      // Initializing first column of array to 1 since sum of 0 is possible only in one way
	      
	    	for(int i = 0; i < n + 1; i++)
	    		arr[i][0] = 1;
	    	
	      // apply loop for finding no of possible ways to sum coins which is equal to given sum
	    	
	    	for(int i = 1; i < n + 1; i++)
	    		for(int j = 0; j < sum + 1; j++)
	    			if(coins[i - 1] > j)  
	    				arr[i][j] = arr[i - 1][j];
	    			else  
	    				arr[i][j] = arr[i][j - coins[i - 1]] + arr[i - 1][j];
	    	
	    	return arr[n][sum];
	    }

}
