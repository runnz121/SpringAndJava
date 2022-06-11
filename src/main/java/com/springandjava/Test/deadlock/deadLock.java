package com.springandjava.Test.deadlock;

//https://www.tutorialspoint.com/java/java_thread_deadlock.htm
public class deadLock {

    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[]) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();

        T1.setPriority(Thread.NORM_PRIORITY);
        T2.setPriority(Thread.NORM_PRIORITY);
        T1.start();
        T2.start();
    }


    /**
     * 1. synchronized로 각 두 객체에 대해 동시에 쓰레드 사용 불가(쓰레드 동기화) -> 상호 배제 (synchronized -> 객체에 락을 걸음)
     * 2. thread 1 -> object 1 락 갖고있음, thread2 -> object 2 락 갖고 있으면서 object1 락 획득하길 원함 -> 점유 대기
     * 3. thread 우선순위는 동일 셋팅 -> 비선점
     * 4. first Thread는 object2 객체의 락 대기, Second Thread는 Object1 객체의 락 대기 -> 환형대기
     */

    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }
    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");

                try {
                    Thread.sleep(10);
                }
                catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}
