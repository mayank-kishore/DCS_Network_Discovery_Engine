class TestTask implements Runnable {
   private Thread t;
   
   public void run() {
    for(int i = 0 ;i<2560;i++){
            int tmp = 5 ; 
            tmp = tmp + 5; 
            tmp *= 5 ; 
            tmp /= 5 ; 
    }
   }
   public void start ()
   {
      if (t == null)
      {
         t = new Thread ();
         t.start ();
      }
   }
}