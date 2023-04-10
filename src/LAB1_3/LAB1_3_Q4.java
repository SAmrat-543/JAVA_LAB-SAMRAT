package LAB1_3;

public class LAB1_3_Q4 {

    public static void main(String[] args) {
        //ThreadPriorityExample
        System.out.println("## 4. Write a program to execute multiple threads in priority base.");
        // Creating three threads with different priorities
        Thread thread1 = new MyThread("t1", Thread.MAX_PRIORITY);
        Thread thread2 = new MyThread("t2", Thread.NORM_PRIORITY);
        Thread thread3 = new MyThread("t3", Thread.MIN_PRIORITY);

        // Starting the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class MyThread extends Thread {
        public MyThread(String name, int priority) {
            super(name);
            setPriority(priority); // Setting the priority for the thread
        }

        @Override
        public void run() {
            System.out.println("Thread " + getName() + " started.");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread " + getName() + ": Cycle " + i);
                try {
                    sleep(1000); // Sleep for 1 second
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread " + getName() + " finished.");
        }
    }
}
