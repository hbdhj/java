package spojpackage;
import java.io.*;

class T450 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String line = null;
	    try {
	      BufferedReader is = new BufferedReader(
	        new InputStreamReader(System.in));
	      String str=is.readLine();
	      String[] sArray=str.split(" ") ;
	      long n=Long.parseLong(sArray[0]);
	      long k=Long.parseLong(sArray[1]);
	      
	      long ti;
	      long ret=0;
		      for(long i=0;i<n;i++)
		      {
		    	  str=is.readLine();
		    	  ti=Long.parseLong(str);
		    	  if(ti%k==0)
		    		  ret++;
		      }
		      System.err.println(ret);
	    } catch (IOException e) {
	      System.err.println("Unexpected IO ERROR: " + e);
	    }
	}
}
