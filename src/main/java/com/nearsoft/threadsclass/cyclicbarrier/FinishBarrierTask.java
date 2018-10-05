package main.java.com.nearsoft.threadsclass.cyclicbarrier;

public class FinishBarrierTask implements Runnable {
    @Override
    public void run() {
        System.out.println("FinishBarrierTask: All the tasks have finished");
    }
}