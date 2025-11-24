package menuSystem;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> children;
    private MenuComponent parent;

    public Menu(String title, String description) {
        super(title, description);
        this.children = new ArrayList<>();
        this.parent = null;
    }

    public Menu(String title, String description, MenuComponent parent) {
        super(title, description);
        this.children = new ArrayList<>();
        this.parent = parent;
    }

    public void addComponent(MenuComponent component) {
        children.add(component);
    }

    @Override
    public void display() {
        displayHeader();
        
        if (children.isEmpty()) {
            System.out.println("This menu is empty.");
            return;
        }
        for (int i = 0; i < children.size(); i++) {
            System.out.println((i + 1) + ". " + children.get(i).getTitle());
        }
        System.out.println("0. " + (parent == null ? "Exit" : "Back"));
    }

    @Override
    public void execute() {
        // Menu execution involves navigation
        navigate();
    }

    @Override
    public MenuComponent navigate() {
        while (true) {
            display();
            int choice = getValidInput(children.size());
            
            if (choice == 0) {
                if (parent == null) {
                    System.out.println("Thank you for using the Menu System!");
                    System.exit(0);
                }
                return parent; // Recursive return to parent
            }
            
            MenuComponent selected = children.get(choice - 1);
            System.out.println("Navigating to: " + selected.getTitle());
            MenuComponent next = selected.navigate(); // Recursive call
            
            if (next != this) {
                return next; // Continue recursive navigation
            }
          
        }
    }

    public void setParent(MenuComponent parent) {
        this.parent = parent;
    }
}
