package indi.qding.java.多线程.线程的三种实现方式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @ClassName 覆写Callable接口
 * @Description TODO
 * @Author Administrator
 * @Date 2021/2/14 20:38
 * @Version 1.0
 **/
public class 覆写Callable接口 implements Callable<String> {

    private static int count = 1000;

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 1000; i++) {
            //这里先加个锁，不然会出现一张票卖多次
            synchronized (this){
                if (count > 0) {
                    count--;
                    System.out.println(Thread.currentThread().getName() + "-剩余票数：" + count);
                }
            }
        }
        return Thread.currentThread().getName() + "已售罄！";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable callable = new 覆写Callable接口();
        FutureTask<String> futureTask1 = new FutureTask<String>(callable);
        FutureTask<String> futureTask2 = new FutureTask<String>(callable);
        FutureTask<String> futureTask3 = new FutureTask<String>(callable);
        new Thread(futureTask1, "窗口1").start();
        new Thread(futureTask2, "窗口2").start();
        new Thread(futureTask3, "窗口3").start();

        System.out.println(futureTask1.get());
        System.out.println(futureTask2.get());
        System.out.println(futureTask3.get());


    }
}
