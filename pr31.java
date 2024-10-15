class prac31 implements Runnable {

    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new prac31());
        t.start();
    }
}
