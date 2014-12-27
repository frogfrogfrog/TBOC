package ch1.l1;

public class CPUSin implements Runnable{
	final int count=200;
	final double pi=Math.PI;
	final int interval=300;
	final int half=interval/2;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long[] busySpan=new long[count];
		long[] idleSpan=new long[count];
		for(int i=0;i<count;i++){
			busySpan[i]=(long) (half+Math.sin(2*pi/count*i)*half);
			idleSpan[i]=interval-busySpan[i];
		}
		long startTime=0;
		int j=0;
		while(true){
			j=j%count;
			startTime=System.currentTimeMillis();
			while(System.currentTimeMillis()-startTime<busySpan[j]);
			try {
				Thread.sleep(idleSpan[j]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			j++;
		}
		
	}
	

}
