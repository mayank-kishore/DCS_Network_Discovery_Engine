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
      /*  //try
       // {
            Long duration = (long) (Math.random() * 10);
            System.out.println("Doing a task during : " + name);
            //TimeUnit.SECONDS.sleep(duration);
      //  } 
        /*catch (InterruptedException e) 
        {
            e.printStackTrace();
        }*/
	/*try {
           String ipAddress = "10.8.13."+name;
           InetAddress inet = InetAddress.getByName(ipAddress);
	   NetworkInterface netIntfc = NetworkInterface.getByInetAddress( inet ) ;//optional
	   boolean reachable = inet.isReachable(netIntfc , 0,10000 );
           //System.out.println("Sending Ping Request to " + ipAddress);      
	         //if (inet.isReachable(10000)){
			if(reachable){
                                          System.out.println(ipAddress + " is reachable.");
            } 
	         else {
                  System.out.println(ipAddress + " NOT reachable.");
            }
        }  
	   catch ( Exception e ) {
                             System.out.println("Exception:" + e.getMessage());
      }
	*/
	runSystemCommand("ping -c1 -W10 -q " + "10.8.13."+name);
    	}
    
}
