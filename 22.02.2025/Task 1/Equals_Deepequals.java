package sample;


	import java.util.Arrays;

	public class Equals_deepequals {
	    
	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5, 6};
	        int[] b = {1, 2, 3, 4, 5, 6};
	        
	        int[][] c = {{1, 4, 8}, {2, 6, 8}};
	        int[][] d = {{1, 4, 8}, {2, 6, 8}};
	        
	        methodDeepEquals(c,d);
	        methodEquals(a,b);
	        
	    }

	    public static void methodDeepEquals( int[][] c, int[][] d) {
	      
	        if (Arrays.deepEquals(c, d)) 
	            System.out.println(" equal"); 
	        else
	            System.out.println(" not equal");
	    }
	    
	    public static void methodEquals(int[] a,int[] b)
	    {
	    	  if (Arrays.equals(a, b)) 
	              System.out.println("equal"); 
	          else
	              System.out.println("not equal");
	          
	    }
	}

