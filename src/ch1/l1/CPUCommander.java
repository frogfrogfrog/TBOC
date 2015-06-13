package ch1.l1;

public class CPUCommander implements Runnable{
	//±‡≥Ã÷Æ√¿1°£1
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long startTime=0;
		int busyTime=10;
		while(true){
			startTime=System.currentTimeMillis();
			while(System.currentTimeMillis()-startTime<busyTime);
			try {
				Thread.sleep(busyTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
