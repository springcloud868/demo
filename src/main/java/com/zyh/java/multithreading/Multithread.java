package com.zyh.java.multithreading;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.*;

/**
 * @author zhaoyinghao
 * @decription
 * @date 2022/2/22
 */
public class Multithread implements Runnable{

    int i ;

    public static void main(String[] args){
        ExecutorService executor = newFixedThreadPool(90);
        Multithread threadDemo1 = new Multithread();
        Multithread threadDemo2 = new Multithread();
        Multithread threadDemo3 = new Multithread();
        Multithread threadDemo4 = new Multithread();
        Multithread threadDemo5 = new Multithread();
        executor.execute(threadDemo1);
        executor.execute(threadDemo2);
        executor.execute(threadDemo3);
        executor.execute(threadDemo4);
        executor.execute(threadDemo5);
        executor.shutdown();
    }

    @Override
    public void run() {
        i = i+1;
        System.out.println(i);
    }
}


