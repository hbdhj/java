package spojpackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Input:
3
17
11011
17
Output:
11101
11011
11101
*/
class C370 {

	private static boolean onlyOnesAndZeros(long n)
	{
		boolean ret=false;
		int mod=10;
		while((n%mod==1)||(n%mod==0))
		{
			//System.out.println("n = "+n);
			n=n/10;
			if(n==1)
				ret=true;
			else if(n<10)
				break;
		}
		return ret;
	}
	private static int pair(int n)
	{
		int ret=0;
		switch(n)
		{
		case 1:
			ret=1;
			break;
		case 3:
			ret=7;
			break;
		case 7:
			ret=3;
			break;
		case 9:
			ret=9;
			break;
		default:
			ret=5;
			
		}
		return ret;
	}
	private static void multiply(long n)
	{
		int zeros=0;
		while(n%10==0)
		{
			n=n/10;
			zeros++;
		}
		long num=n;
		int last=pair((int)(num%10));		
		int mul;
		//if(last==0)
		//	mul=1;
		//else
			mul=last;
		//System.out.println("num="+num);
		while(onlyOnesAndZeros(num)==false)
		{
			num=n*mul;
			//System.out.println(mul);
			//if(mul>10)
			//	break;
			//if(last==0)				
			//	mul++;
			//else
				mul+=10;
		}
		//System.out.println(mul);
		System.out.print(num);
		while(zeros>0)
		{
			System.out.print(0);
			zeros--;
		}
		System.out.println();		
	}
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
            int[] v=new int[n];
            for(int i=0;i<n;i++)
            {
            	line = is.readLine();
                int num = Integer.parseInt(line);
                v[i]=num;
            }
            for(int i=0;i<n;i++)
            {
                multiply((long)v[i]);
            }
		} catch (IOException e) {
		      System.err.println("Unexpected IO ERROR: " + e);
		}
	}
}
