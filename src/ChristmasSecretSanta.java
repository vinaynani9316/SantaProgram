import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChristmasSecretSanta 
{
	public String[] PopAssignments(String[] names)
	{
		if(names== null)                 // in case of null input return null
			return null;
		
		if(names.length ==0)            // in case of array with length 0 the return an empty String array
			 return new String[0];
		
		if(names.length==1)           // in case of single element in array return the same array
			return names;
		
		int nLength= names.length;
		
		Boolean[] chosen = new Boolean[nLength];
		Boolean[] santa = new Boolean[nLength];
		
		Arrays.fill(chosen, false);                // Initializing array with false
		Arrays.fill(santa, false); 
		
		Random r = new Random();
		
		String[] result = new String[names.length];              // result of array
		int position=0;
		
		while(true)
		{
			int random1 =r.nextInt(nLength);
			int random2 =r.nextInt(nLength);
			
			String person1= names[random1];                    // getting random person
			String person2= names[random2];
			
			if(person1 == person2)
			{
				 
			}
			
			if ((!person1.equals(person2)) && (santa[random1] == false)         // if two persons names are not same	
			          && (chosen[random2] == false)) {
			 
			if(!person1.equals(names[position]))
			{
				result[position] =person1;
				position++;
				
				santa[random1] = true;
				chosen[random2] =true;
				 
				if (isArrayCompleted(santa) && isArrayCompleted(chosen))
					break;
			}
		}
	}
       return result;
}
  private boolean isArrayCompleted(Boolean[] arr)                      // checking the array execution function
  {
	  for(int i=0; i<arr.length; i++ )
	  {
		  if(arr[i]== false)
		  {
			  return false;
		  }
	  }
	  return true;
  }
  
    public static void main(String[] a)
    {
    	final String[] participants =
    			new String[] {"Fyroz", "Hari", "krupa", "Sreeneela", "Harish", "Ramu", "Vinay", "Dhanunjay", "Kondayya"};
    	
    	final String[] assignments= new ChristmasSecretSanta().PopAssignments(participants);
    			
    	for (int i=0; i<assignments.length; i++)
    	{
    		System.out.println(participants[i]+ "->" +assignments[i]);
    		if(assignments[i].equals(participants[i]))
    		{
    			System.out.println("Error: " +assignments[i]);
    		}
    	}
    	
    }
   
 }