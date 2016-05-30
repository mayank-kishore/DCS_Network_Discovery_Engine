import java.util.concurrent.TimeUnit;
import java.net.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Task implements Runnable 
{
    private String name;
 
    public Task(String name) 
    {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
 	
 public static void runSystemCommand(String command) {

		try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(p.getInputStream()));
			//System.out.println(p.waitFor());

			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    @Override
    public void run() 
    {
    	for(int i=0;i<256;i++){
      		runSystemCommand("sudo ./arpa1 " + "10.8."+i+"."+name);
    	}
    }
}

