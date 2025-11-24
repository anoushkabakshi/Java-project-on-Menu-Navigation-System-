package menuSystem;

public class Main {
    public static void main(String[] args) {
        try {
            NavigationSystem system = new NavigationSystem();
            system.start();
        } catch (Exception e) {
            System.out.println("❌ Error starting the system: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
