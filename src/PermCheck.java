import java.util.Scanner;

public class PermCheck 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		int [] A; //Array of Values
		int len; //Length of Array
		boolean perm;
		
		//Enter and Set Array Length
		System.out.print("Enter the Length of the Array: ");
		len = cin.nextInt();
		A = new int [len];
			
		//Fill Array
		for (int i=0; i<A.length; i++)
		{
			System.out.print("Enter Element "+(i+1)+": ");
			A[i] = cin.nextInt();
		}
		
		cin.close(); //Close cin, No More Inputs Needed
		checkPerm temp = new checkPerm(); //Create Instance of Class to Check for Permutation
		perm = temp.AOC(A); //Check Using Array of Counters
		perm = temp.Hash(A); //Check Using Hash Table
		
		System.out.println("");
		
		//Display Whether Array is Permutation or Not
		if (perm == true)
			System.out.println("Array is a Permutation");
		else if (perm == false)
			System.out.println("Array is not a Permutation");
	}
}
