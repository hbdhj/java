package spojpackage;
/*
5
00:00
03:00
00:00
00:10
06:00
12:00
11:59
12:01
00:00
12:00
Output
2
0
6
1
11
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class C9046 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] matchMinus=new double[22];
		for(int hour=1;hour<24;hour++)
		{
			if(hour>11)
			{
				matchMinus[hour-2]=60.0/11*(hour-12)+hour*60;
				
			}
			else
			{
				matchMinus[hour-1]=60.0/11*hour+hour*60;
				//System.out.print(hour + "th meet time is " + matchMinus[hour-1]+" = ");
				//System.out.println((int)(matchMinus[hour-1]/60)+":"+(int)(matchMinus[hour-1]%60));
			}
		}
		for(int hour=0;hour<22;hour++)
		{
			//System.out.print(hour+1 + "th meet time is " + matchMinus[hour]+" = ");
			//System.out.println((int)(matchMinus[hour]/60)+":"+(int)(matchMinus[hour]%60));
			System.out.format("%dth meet time is %.2f = %02d:%02d%n", hour+1, matchMinus[hour], (int)(matchMinus[hour]/60), (int)(matchMinus[hour]%60));
		}
	}

}
