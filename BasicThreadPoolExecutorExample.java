import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
 
public class BasicThreadPoolExecutorExample 
{
    public static void main(String[] args) 
    {
        //Use the executor created by the newCachedThreadPool() method 
        //only when you have a reasonable number of threads 
        //or when they have a short duration.
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (int i = 0; i <= 255; i++) 
        {
            Task task = new Task(Integer.toString(i));
            System.out.println("A new task has been added : " + task.getName());
            executor.execute(task);
		/*try{
	    TimeUnit.SECONDS.sleep(1);
}catch(Exception e){
}*/
        }
        executor.shutdown();
    }
}
