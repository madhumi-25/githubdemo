class demo extends Thread
{
	public void run() {
		try
		{
			Thread.sleep(1000);
			System.out.println("task");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception handled" +e);
		}
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo t1=new demo();
		t1.start();
		t1.interrupt();

	}

}
