
public class MyTimer implements Runnable {
	
	String message;
	long waitTime;
	Thread thread;
	
	public MyTimer(long waitTime, String message) {
		this.message = message;
		this.waitTime = waitTime;
		thread = new Thread(this);
		thread.start();
		
	}

	@Override
	public void run() {
		try {
			while (true) {
				sayHello(message);
				System.out.println(message + DBConnection.getInstance().getUser());
				Thread.sleep(waitTime);
			}
		} 
		
		catch (Exception ex){
		}
	}
	
	
	public void sayHello(String messageIn)
	{
		String[] mComponents =new String[2];
		mComponents[0]="Hello, I have a lot to say about GIT compared to SVN: ";
		mComponents[1]=messageIn;
		message="";
		for (String string : mComponents) {
			message+=string;
		}
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		new MyTimer(1000, "1");
		new MyTimer(2000, "22");
		new MyTimer(3000, "333");
		new MyTimer(4000, "4444");
		new MyTimer(5000, "55555");
	}
}
