package LAB1_3;


public class LAB1_3_Q3 extends Thread {
    private int start;
    private int end;
    private long interval;

    public  LAB1_3_Q3(int start, int end, long interval) {
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            try {
                Thread.sleep(interval); // Sleep for the specified interval
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Creating and starting the first thread with interval of 0.5 seconds
        // NumberPrinterThread
        System.out.println("## 3. Write a program to create two threads. The first thread should print numbers from 1 to 10 at intervals of 0.5 second and the second thread should print numbers from 11 to 20 at the interval of 1 second. ");
        LAB1_3_Q3  thread1 = new LAB1_3_Q3(1, 10, 500);
        thread1.start();

        // Creating and starting the second thread with interval of 1 second
        LAB1_3_Q3 thread2 = new LAB1_3_Q3(11, 20, 1000);
        thread2.start();
    }
}