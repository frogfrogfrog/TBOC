package ch1.l1;

public class Main {
	public static void main(String[] args){
		int proNum=Runtime.getRuntime().availableProcessors();
		for(int i=0;i<proNum;i++){
			CPUCommander cc=new CPUCommander();
			new Thread(cc).start();
		}
	}
}
