package com.aakash.threading;

public class EvenOdd {
	
	public static int value = 0;
	public static boolean isEven= true;
	
	public static void main(String[] args) {
		Thread evenThread = new Thread(new EvenThread(100));
		Thread oddThread = new Thread(new OddThread(100));
		evenThread.start();
		oddThread.start();
		
	}

}
class EvenThread implements Runnable{
	int maxValue;
	public EvenThread(int maxValue){
		this.maxValue=maxValue;
	}
	public void run() {
		while(EvenOdd.value<=maxValue){
			if(EvenOdd.isEven){
				System.out.println(EvenOdd.value);
				++EvenOdd.value;
				EvenOdd.isEven=false;
			}
		}
	}
	
}
class OddThread implements Runnable{
	int maxValue;
	public OddThread(int maxValue){
		this.maxValue=maxValue;
	}
	public void run() {
		while(EvenOdd.value<=maxValue){
			if(!EvenOdd.isEven){
				System.out.println(EvenOdd.value);
				++EvenOdd.value;
				EvenOdd.isEven=false;
			}
		}
	}	
}
