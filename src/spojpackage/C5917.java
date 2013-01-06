package spojpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;


/*
 * 
Input:
3
1
10
100
Output:
1
7
158
pi= 3.14159265358979323 
e =2.71828182845904523536 
n!~sqrt(2*pi*n)*(n/e)^n
So ln(n!)=(ln(2)+ln(pi)+ln(n))/2+n*(ln(n)-1)
So log(n!)=(log(2)+log(pi)+log(n))/2+n*(log(n)-log(e))
 */

class C5917 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			final double pi= 3.14159265358979323; 
			final double e =2.71828182845904523536;
			BufferedReader is = new BufferedReader(
		        new InputStreamReader(System.in));
		      String str=is.readLine();
		      int n=Integer.parseInt(str);
		      long[] v=new long[n];
		      for(int i=0;i<n;i++)
			  {
			  	  str=is.readLine();
			  	  //int ti=Integer.parseInt(str);
			  	  long ti=Long.parseLong(str);
			  	  v[i]=ti; 
			  }
		      for(int i=0;i<n;i++)
			  {
		    	  if(v[i]==1)
		    		  System.err.println(1);
		    	  else
		    	  {
			    	  double ln_n=Math.log((double)v[i]);
			    	  double ln_nf=(Math.log(2.0)+Math.log(pi)+ln_n)/2+v[i]*(ln_n-1);
			    	  long ret=(long) Math.ceil(ln_nf/Math.log(10.0));
				      System.err.println(ret);
		    	  }
		      }
		    } catch (IOException e) {
		      System.err.println("Unexpected IO ERROR: " + e);
		    }
	}

}
