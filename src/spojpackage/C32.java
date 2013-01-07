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
		//String Haystack="barfoobarfoobarfoobarfoobarfoo";
		//String Needle ="foobarfoo";
		String Needle ="foo";
		String Haystack ="foobarfoo";
		// initialize T for Needle
		int[] Transfer=new int[Needle.length()];
		Transfer[0]=-1;
		Transfer[1]=0;
		int pos=2;
		int cnd=0;
		while(pos<Needle.length())
		{
			if(Needle.charAt(pos-1)==Needle.charAt(cnd))
			{
				cnd++;
				Transfer[pos]=cnd;
				pos++;
			}
			else if(cnd>0)
			{
				cnd=Transfer[cnd];
			}
			else
			{
				Transfer[pos]=0;
				pos++;
			}
		}
		int i;
		for(i=0;i<Needle.length()-1;i++)
		{
			System.out.print(Transfer[i]+" ");			
		}
		System.out.println(Transfer[i]);
		int m=0;
		//int i=0;
		i=0;
		System.out.println(Needle);
		System.out.println(Haystack);
		while((m+i)<Haystack.length())
		{
			//System.out.println("i = "+i);
			//System.out.println("m = "+m);
			if(Needle.charAt(i)==Haystack.charAt(m+i))
			{
				if(i==(Needle.length()-1))
				{
					System.out.println(m);
					m+=Transfer[Needle.length()-1];
					i=0;
				}
				else
					i++;
			}
			else
			{
				m=m+i-Transfer[i];
				if(Transfer[i]>-1)
					i=Transfer[i];
				else
					i=0;		
			}
		}
		/*for(i=1;i<Needle.length();i++)
		{
		   while ((j>0)&&(Needle.charAt(j+1)==Needle.charAt(i))) 
		   {
			   j=PNeedle[j];
			   if(Needle.charAt(j+1)==Needle.charAt(i))
				   j=j+1;
			   PNeedle[i]=j;
		   }
		};
		int i;
		for(i=0;i<Needle.length()-1;i++)
		{
			System.out.print(PNeedle[i]+" ");			
		}
		System.out.println(PNeedle[i]);*/
		/*
		j:=0;
		for i:=1 to n do
		begin
		   while (j>0) and (B[j+1]<>A[i]) do j:=P[j];
		   if B[j+1]=A[i] then j:=j+1;
		   if j=m then
		   begin
		      writeln('Pattern occurs with shift ',i-m);
		      j:=P[j];
		   end;
		end;
		*/
	}
}
