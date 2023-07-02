package assignments;

public class Assig08 {

	    public static void main(String[] args) {
	        int[] array1 = {2, 3, 4, 5, 9};
	        int[] array2 = {2, 3, 4, 5, 6};
	        
	        
	        if(array1.length!=array2.length) {
	        	
	        	System.out.println("The given two arrays are not same");
	        	return;
	        	
	        }
	       
	       int count = 1;
	        
	        for(int i=1; i<array1.length; i++) {
	        	
	        	if(array1[i]==array2[i]) {
	        		count ++;
	        	}
	        	
	        	else
	        		break;
	        }
	        
	        if(count==array1.length) {
	        	System.out.println("The given two arrays are same");
	        }
	        
	        else
	        	System.out.println("The given two arrays are not same");

	    }
	}
