package indi.qding.java.多线程.线程的三种实现方式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName 覆写Runnable接口
 * @Description
 *      继承Thread和实现Runnable接口的区别
 *     a.实现Runnable接口避免多继承局限
 *     b.实现Runnable()可以更好的体现共享的概念
 * @Author Administrator
 * @Date 2021/2/14 20:30
 * @Version 1.0
 **/
public class 覆写Runnable接口 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+">>>"+i);
        }
    }

    public static void main(String[] args) {
        覆写Runnable接口 runnable1 = new 覆写Runnable接口();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            threads.add(new Thread(runnable1, "线程"+i));
        }
        threads.forEach(e->e.start());
    }
}
