package spojpackage;
/*
KMP algorithm
Sample input:

2
na
banananobano
6
foobar
foo
9
foobarfoo
barfoobarfoobarfoobarfoobarfoo
Sample output:

2
4

3
9
15
21
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class C32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Haystack="banananobano";
		//String Needle ="na";
		String Needle ="foo";
		// initialize T for Needle
		int[] PNeedle=new int[Needle.length()];
		PNeedle[0]=0;
		int j=0;
		int i;
		for(i=1;i<Needle.length();i++)
		{
		   while ((j>0)&&(Needle.charAt(j+1)==Needle.charAt(i))) 
			   j=PNeedle[j];
		   if(Needle.charAt(j+1)==Needle.charAt(i))
			   j=j+1;
		   PNeedle[i]=j;
		};
		for(i=0;i<Needle.length()-1;i++)
		{
			System.out.print(PNeedle[i]+" ");			
		}
		System.out.println(PNeedle[i]);
	}

}
