package com.aakash.threading;

class Printer {

    boolean isOdd;


    synchronized void printOdd(int number) {

        while(isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("odd:"+number);
        isOdd = true;
        notifyAll();
    }

    synchronized void printEven(int number) {
        while(!isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:"+number);
        isOdd = false;
        notifyAll();
    }

}
