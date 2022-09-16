package basicsofprogramming;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {3, 2, 10, 7, 15};     
	     int temp = 0;       
	     for (int i = 0; i < arr.length; i++) 
	     {     
	    	 for (int j = i+1; j < arr.length; j++) 
	    	 {     
	    		 if(arr[i] > arr[j]) 
	    		 {    
	    			 temp = arr[i];    
	    			 arr[i] = arr[j];    
	                 arr[j] = temp;    
	              }     
	          }     
	     }    
	     for (int i = 0; i < arr.length; i++)   
	     	System.out.println(arr[i]);
	     
	     
	     //Using sort function
	     Arrays.sort(arr);
	     for (int i = 0; i < arr.length; i++)   
		     	System.out.println(arr[i]); 
	}
}
