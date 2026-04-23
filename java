public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java App running inside Docker!");

        // Keep the app running
        while (true) {
            try {
                System.out.println("Application is running...");
                Thread.sleep(5000); // wait 5 seconds
            } catch (InterruptedException e) {
                System.out.println("Application interrupted");
            }
        }
    }
}
