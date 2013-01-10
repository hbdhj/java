package spojpackage;
/*
2901. One Geometry Problem
Input:
2
3 8 5
10 18 12

Output:
8
14
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class C2901 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    
	    BufferedReader is = new BufferedReader(
		        new InputStreamReader(System.in));
        String line = is.readLine();
        int n = Integer.parseInt(line);
        BigInteger[] v=new BigInteger[n*3];
        for(int i=0;i<n*2;i++)
        {
          	line = is.readLine();
          	String[] nums=line.split(" ");
            v[i*3]=new BigInteger(nums[0]);
            v[i*3+1]=new BigInteger(nums[1]);
            v[i*3+2]=new BigInteger(nums[2]);
        }
        for(int i=0;i<n;i++)
        {
        	v[i*3]=v[i*3+1].subtract(v[i*3]);
        	v[i*3+2]=v[i*3+1].subtract(v[i*3+2]);
        	System.out.println(v[i*3].add(v[i*3+2]));
        }
        } catch (IOException e) {
		      System.err.println("Unexpected IO ERROR: " + e);
		}    
	}

}
