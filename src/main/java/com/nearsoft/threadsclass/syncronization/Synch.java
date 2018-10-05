package main.java.com.nearsoft.threadsclass.syncronization;

class ThreadDemoSynch extends Thread {
  private Thread t;
  private String threadName;
  PrintDemo  PD;

  ThreadDemoSynch( String name,  PrintDemo pd) {
    threadName = name;
    PD = pd;
  }

  public void run() {
    synchronized(PD) {
      PD.printCount();
    }
    System.out.println("Thread " +  threadName + " exiting.");
  }

  public void start () {
    System.out.println("Starting " +  threadName );
    if (t == null) {
      t = new Thread (this, threadName);
      t.start ();
    }
  }
}

public class Synch {

  public static void main(String args[]) {
    PrintDemo PD = new PrintDemo();

    ThreadDemoSynch T1 = new ThreadDemoSynch( "Thread - 1 ", PD );
    ThreadDemoSynch T2 = new ThreadDemoSynch( "Thread - 2 ", PD );

    T1.start();
    T2.start();

    // wait for threads to end
    try {
      T1.join();
      T2.join();
    } catch ( Exception e) {
      System.out.println("Interrupted");
    }
  }
}