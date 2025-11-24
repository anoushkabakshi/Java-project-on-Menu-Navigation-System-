package menuSystem;


public class MenuItem extends MenuComponent {
    private Runnable action;
    private MenuComponent parent;

    public MenuItem(String title, String description, Runnable action, MenuComponent parent) {
        super(title, description);
        this.action = action;
        this.parent = parent;
    }

    
    public void display() {
        displayHeader();
        System.out.println("This is an executable menu item.");
        System.out.println("Press Enter to execute or 0 to go back...");
    }

    
    public void execute() {
        if (action != null) {
            action.run();
        } else {
            System.out.println("Action executed: " + title);
        }
    }

 
    public MenuComponent navigate() {
        display();
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equals("0")) {
                return parent; 
            } else if (input.isEmpty()) {
                execute();
                System.out.println("\nPress Enter to continue or 0 to go back...");
            } else {
                System.out.println("Invalid input! Press Enter to execute or 0 to go back.");
            }
        }
    }
}
