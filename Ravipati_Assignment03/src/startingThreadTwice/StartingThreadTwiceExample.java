package startingThreadTwice;

public class StartingThreadTwiceExample extends Thread{
	public void run(){  
		   System.out.println("running...");  
		 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		StartingThreadTwiceExample t1=new StartingThreadTwiceExample();  
			  t1.start();  
			  t1.start();  
			 }  
	}


