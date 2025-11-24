# Java-project-on-Menu-Navigation-System-
Menu Navigation System project on java based on inheritance class and recursion 
# Menu Navigation System in Java

A comprehensive Java application demonstrating **recursion** and **inheritance** concepts through an interactive menu navigation system.

## Project Overview

This project implements a hierarchical menu system where users can navigate through nested menus, demonstrating key Object-Oriented Programming principles:

- **Inheritance**: `Menu` and `MenuItem` classes extend the abstract `MenuComponent`
- **Recursion**: Menu navigation uses recursive method calls
- **Polymorphism**: Different menu components behave differently through common interface
- **Composite Pattern**: Menus can contain other menus or menu items


 ## Project Structure
 
MenuNavigationSystem/
├── src/menuSystem/
│   ├── MenuComponent.java    # Abstract base class
│   ├── Menu.java            # Composite menu class
│   ├── MenuItem.java        # Leaf menu item class
│   ├── NavigationSystem.java # System manager
│   └── Main.java           # Entry point
└── README.md
