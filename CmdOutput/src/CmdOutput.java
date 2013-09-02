import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CmdOutput {
	public static void main(String[] args)
	{
		try{
			Runtime rt = Runtime.getRuntime();

			Process proc = rt.exec("ls");
			
	        BufferedReader stdInput = new BufferedReader(new 
	                InputStreamReader(proc.getInputStream()));

	        BufferedReader stdError = new BufferedReader(new 
	                InputStreamReader(proc.getErrorStream()));
	        
	        String line = null;
	        // read the output from the command
	        //System.out.println("Here is the standard output of the command:\n");
	        while ((line = stdInput.readLine()) != null) {
	               System.out.println(line);
	        }

	        // read any errors from the attempted command
	        //System.out.println("Here is the standard error of the command (if any):\n");
	        while ((line = stdError.readLine()) != null) {
	               System.out.println(line);
	        }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
