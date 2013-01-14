package spojpackage;

//import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;

class C328 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//String current_directory = System.getProperty("user.dir");
			//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(current_directory+"/src/spojpackage/c328.txt")));
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
			String data = null; 
			while((data = br.readLine())!=null) 
			{ 
				System.out.println(data);
				if(data.compareTo(new String("1"))>0)
				{
					BigInteger a=new BigInteger(data);
					BigInteger b=a.subtract(new BigInteger(new String("1")));
					BigInteger c=b.add(b);
					System.out.println(c); 
				}
				else
					System.out.println("1"); 
			}
			br.close();
			
		} catch (FileNotFoundException e)
		{
			System.err.println(e.toString());
		} catch (IOException e)
		{
			System.err.println(e.toString());
		}
	}
}