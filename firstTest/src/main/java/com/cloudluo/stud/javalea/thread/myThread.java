package com.cloudluo.stud.javalea.thread;

public class myThread extends Thread{

    int innum;

    public myThread(int num) {
        this.innum = num;
    }


    public void run(){
        System.out.println("start: "+this.getId());
        for(int i=0; i<1000; i++ ){
            innum++;
            System.out.println("working: "+this.getId()+", num:"+innum);
        }
    }
}
