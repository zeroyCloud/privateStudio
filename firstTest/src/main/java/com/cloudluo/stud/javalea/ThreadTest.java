package com.cloudluo.stud.javalea;

import com.cloudluo.stud.javalea.thread.myThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by CloudLuo on 2017/5/7.
 */
public class ThreadTest {

    public static int tnum = 0;

    public static void main(String args[]){
        Thread thread1 = new myThread(tnum);
        Thread thread2 = new myThread(tnum);
        Thread thread3 = new myThread(tnum);
        Thread thread4 = new myThread(tnum);
        Thread thread5 = new myThread(tnum);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


//        for(int i=0; i<10;i++){
//            Thread thread = new myThread(tnum);
//            thread.start();
//        }
    }





}
