package ch1.l1;

public class Main1 {
	public static void main(String[] args){
		int proNum=Runtime.getRuntime().availableProcessors();
		for(int i=0;i<proNum;i++){
			CPUSin t=new CPUSin();
			new Thread(t).start();
		}		
	}
}
