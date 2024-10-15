class CustomThread extends Thread {

    public CustomThread(String name) {
        super(name); // Set the thread name
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

public class pr35 {

    public static void main(String[] args) {

        // Create three threads with names 'FIRST', 'SECOND', and 'THIRD'
        CustomThread firstThread = new CustomThread("FIRST");
        CustomThread secondThread = new CustomThread("SECOND");
        CustomThread thirdThread = new CustomThread("THIRD");

        // Set the priorities
        firstThread.setPriority(3);  // Priority set to 3 for FIRST thread
        // secondThread will keep the default priority, which is 5
        thirdThread.setPriority(7);  // Priority set to 7 for THIRD thread

        // Start the threads
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
