package menuSystem;

public class NavigationSystem {
    private Menu rootMenu;
    private MenuComponent currentMenu;

    public NavigationSystem() {
        buildMenuHierarchy();
        currentMenu = rootMenu;
   
    private void buildMenuHierarchy() {

        rootMenu = new Menu("Main Menu", "Welcome to the Navigation System Demo!");

     
        Menu settingsMenu = new Menu("Settings", "System configuration options", rootMenu);
        
        Menu displaySettings = new Menu("Display Settings", "Screen and appearance settings", settingsMenu);
        displaySettings.addComponent(new MenuItem("Brightness", "Adjust screen brightness", 
            () -> System.out.println("Brightness adjustment triggered!"), displaySettings));
        displaySettings.addComponent(new MenuItem("Resolution", "Change display resolution", 
            () -> System.out.println("Resolution change dialog opened!"), displaySettings));
        
        Menu soundSettings = new Menu("Sound Settings", "Audio and volume controls", settingsMenu);
        soundSettings.addComponent(new MenuItem("Volume", "Adjust system volume", 
            () -> System.out.println("Volume control activated!"), soundSettings));
        soundSettings.addComponent(new MenuItem("Sound Effects", "Enable/disable sound effects", 
            () -> System.out.println("Sound effects toggled!"), soundSettings));

        settingsMenu.addComponent(displaySettings);
        settingsMenu.addComponent(soundSettings);
        settingsMenu.addComponent(new MenuItem("Reset to Default", "Restore default settings", 
            () -> System.out.println("All settings reset to default!"), settingsMenu));

  
        Menu gamesMenu = new Menu("Games", "Fun and entertainment", rootMenu);
        
        Menu puzzleGames = new Menu("Puzzle Games", "Brain teasers and challenges", gamesMenu);
        puzzleGames.addComponent(new MenuItem("Sudoku", "Classic number puzzle", 
            () -> System.out.println("Starting Sudoku game..."), puzzleGames));
        puzzleGames.addComponent(new MenuItem("Crossword", "Word puzzle challenge", 
            () -> System.out.println("Loading crossword puzzle..."), puzzleGames));
        
        Menu actionGames = new Menu("Action Games", "Fast-paced excitement", gamesMenu);
        Menu shootingGames = new Menu("Shooting Games", "Aim and fire!", actionGames);
        shootingGames.addComponent(new MenuItem("Space Invaders", "Classic arcade game", 
            () -> System.out.println("Launching Space Invaders..."), shootingGames));
        shootingGames.addComponent(new MenuItem("Zombie Shooter", "Survival horror game", 
            () -> System.out.println("Starting Zombie Shooter..."), shootingGames));
        
        actionGames.addComponent(shootingGames);
        actionGames.addComponent(new MenuItem("Racing", "High-speed racing game", 
            () -> System.out.println("Starting racing game..."), actionGames));

        gamesMenu.addComponent(puzzleGames);
        gamesMenu.addComponent(actionGames);

        // Tools submenu
        Menu toolsMenu = new Menu("Tools", "Utility applications", rootMenu);
        toolsMenu.addComponent(new MenuItem("Calculator", "Simple calculator tool", 
            () -> {
                System.out.println("Calculator activated!");
                System.out.println("Sample calculation: 15 + 27 = " + (15 + 27));
            }, toolsMenu));
        toolsMenu.addComponent(new MenuItem("Notepad", "Simple text editor", 
            () -> System.out.println("📝 Notepad opened! Ready for typing..."), toolsMenu));


        rootMenu.addComponent(settingsMenu);
        rootMenu.addComponent(gamesMenu);
        rootMenu.addComponent(toolsMenu);
        rootMenu.addComponent(new MenuItem("About", "System information", 
            () -> {
                System.out.println(" Menu Navigation System v1.0");
                System.out.println("Demonstrating Recursion & Inheritance");
                System.out.println("Java OOP Concepts in Action!");
            }, rootMenu));
    }

    public void start() {
        System.out.println("Starting Menu Navigation System...");
        System.out.println(" Built with Recursion and Inheritance\n");
  
        currentMenu.navigate();
    }

    public static void main(String[] args) {
        NavigationSystem system = new NavigationSystem();
        system.start();
    }
}
