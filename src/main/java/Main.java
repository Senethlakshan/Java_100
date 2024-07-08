public class Main extends Thread {

    public void run() {
        // Code that will be executed in a new thread
        System.out.println("MyThread is running");
    }

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start(); // Start the thread
    }
}
