package menuSystem;

import java.util.Scanner;

public abstract class MenuComponent {
    protected String title;
    protected String description;
    protected Scanner scanner = new Scanner(System.in);

    public MenuComponent(String title, String description) {
        this.title = title;
        this.description = description;
    }

   
    public abstract void display();
    public abstract void execute();
    public abstract MenuComponent navigate();

 
    protected void displayHeader() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println(">>> " + title.toUpperCase());
        System.out.println("=".repeat(50));
        if (description != null && !description.isEmpty()) {
            System.out.println(description);
            System.out.println("-".repeat(50));
        }
    }

    protected int getValidInput(int maxChoice) {
        while (true) {
            System.out.print("Enter your choice (1-" + maxChoice + ", 0 to go back): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 0 && choice <= maxChoice) {
                    return choice;
                } else {
                    System.out.println(" Please enter a number between 0 and " + maxChoice);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }

  
    public String getTitle() { return title; }
    public String getDescription() { return description; }
}
