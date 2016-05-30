import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
 
public class TestPool 
{
    public static void main(String[] args) 
    {
        //System.out.println("Hello");    
        //System.out.println(args[0]);    
      //  ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (int i = 0; i < Integer.parseInt(args[0]); i++) 
        {
            TestTask task = new TestTask();
  //          executor.execute(task);
        }
      //  executor.shutdown();
    }
}
