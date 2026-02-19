package java_basics;

public class LoopExamples {

	public static void main(String[] args) {
		// Do While loop
		int retryAttempt = 0;
		do {
			retryAttempt++;
			System.out.println("Retrying test case execution." + (retryAttempt));
		
		}while(retryAttempt < 3);
		System.out.println("Test case execution completed");
		
		//While loop
	      while(retryAttempt < 3) {
		retryAttempt++;
		System.out.println("Retrying test case execution." + (retryAttempt));
	}
	      
	      //For loop
	      for(int retryAttempt1 = 1; retryAttempt1 < 3; retryAttempt1++) {
	    	  System.out.println("Retrying test case execution. Attempt " + (retryAttempt + 1));  
	    	  
	      }
	      
	      for(int i=0; i<5; i++) {
	    	  System.out.println("itteration: " + i);
	      }
	      
	      for(int i=0; i<5; i++) {
	    	  System.out.println("itteration: " + i);
	    	  if(i==2) {
	    		 break; 
	    	  }
	      }
	      
	      for(int i=0; i<5; i++) {
	    	  System.out.println("itteration: " + i);
	    	  if(i==2) {
	    
	    	  }
	      }
	      
	      for(int i=0; i<5; i++) {
	    	  if(i==2) {
	    		 continue; 
	    	  }
	      
	    		 System.out.println("itteration: " + i); 
	      }	 
	      
	      for(int i=0; i<5; i++) {
	    	  System.out.println("Outer loop itteration:" + i);
	    	  for(int j=0; j<3; j++) {
	    		  System.out.println("Inner loop itteration:" + j);
	    		  
	    		  System.out.println("--------------------------");
	    	  }
	      }
	      
	      
	 System.out.println("Test case execution completed");
	 
	 
			
		}

	}


