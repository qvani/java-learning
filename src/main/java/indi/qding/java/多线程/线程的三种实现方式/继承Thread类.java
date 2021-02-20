package indi.qding.java.多线程.线程的三种实现方式;

public class 继承Thread类 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+">>>"+i);
        }
    }

    public static void main(String[] args) {
        继承Thread类 thread1 = new 继承Thread类();
        继承Thread类 thread2 = new 继承Thread类();
        继承Thread类 thread3 = new 继承Thread类();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
