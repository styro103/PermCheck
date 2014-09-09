import java.util.*;

class checkPerm
{
	public boolean AOC(int[] A) //Function to Check if Array is Permutation Using Array of Counters
    {
		long arraysum = 0; //Hold Sum of Array
        long indexsum = 0; //Hold Sum of Indexes
        long [] count = new long [A.length]; //Array of Counters
        
        //for (int i=0; i<count.length; i++) //Fill Array of Counters With Zeroes, Not Needed in Java
            //count[i] = 0;
        
        for (int i=0; i<A.length; i++) //Loop Through Array A
        {
        	//Permutation Can't Contain Number Greater Than Array Length
        	if (A[i]>A.length) //Permutation Must Contain Numbers From 1 to N
            {
                //If Contains Number Greater Than N, Then Not Permutation
            	arraysum = 0; //Make Numbers Different
                indexsum = 1;
                break; //Break Out of Loop
            }
            else
            {
                count[A[i]-1] += 1; //Increment Integer Count by 1
                
                //Permutation Can't Contain Repeated Number
                if (count[A[i]-1]>1) //If Count is Greater Then One (Contains Repeat)
                {
                    //Make Sums Different, Break Out of Loop
                	arraysum = 0;
                    indexsum = 1;
                    break;
                }
                else //Possible Permutation
                {
                    indexsum += (i+1); //Add to indexsum
                    arraysum += A[i]; //Add to arraysum
                }
            }
        }
        
        if (arraysum == indexsum) //If Sums are Equal
            return true; //Array is Permutation
        else //Else
            return false; //Array Isn't Permutation
    }
	
	public boolean Hash(int[] A) //Function to Check if Array is Permutation Using A Hash Set
    {
        Set<Integer> elem = new HashSet<Integer>(); //Hash Set to Keep Track of Values
        long arraysum = 0; //Hold Sum of Array
        long indexsum = 0; //Hold Sum of Indexes
        
        for (int i=0; i<A.length; i++) //Loop Through Array A
        {
            if (elem.contains(A[i])) //Check if HashSet Contains Value
            {
                //If So, Make Sums Different, Break Out of Loop
            	indexsum = 0;
                arraysum = 1;
                break;
            }
            else //If Not, Add Element to HashSet, Increment Sums
            {
                elem.add(A[i]);
                indexsum += (i+1);
                arraysum += A[i];
            }
        }
        
        if (arraysum == indexsum) //If Sums are Equal
            return true; //Array is Permutation
        else //Else
            return false; //Array Isn't Permutation
    }
}
