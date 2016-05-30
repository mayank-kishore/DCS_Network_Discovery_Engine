import java.net.*;
public class hostname
{
  public static void main(String args[])
  {
	try{
	    InetAddress inetAddress =InetAddress.getByName("10.8.15.235");//get the host Inet using ip
	    System.out.println ("Host Name: "+ inetAddress.getCanonicalHostName());//display the host
	}
	catch(Exception e){}
  }
}
