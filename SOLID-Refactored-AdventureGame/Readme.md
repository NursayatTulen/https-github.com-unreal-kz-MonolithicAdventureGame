# SOLID Refactoring
## Introduction
This document explains the refactoring process based on SOLID principles to improve code maintainability, flexibility, and scalability.
## Single Responsibility Principle (SRP)
Each class in the refactored code has a single responsibility:
- `Player.java` handles player attributes and actions.
- `CombatManager.java` manages combat interactions.
- `Enemy.java` and its subclasses define enemy behavior.
- `ItemManager.java` handles item-related functionality.
- `LevelManager.java` manages game levels.
## Open/Closed Principle (OCP)
The system is designed to allow extensions without modifying existing code:
- New enemy types can be added by extending `Enemy.java`.
- New items can be introduced by implementing `IItem.java`.
- Game logic can evolve without altering the core mechanics.
## Liskov Substitution Principle (LSP)
Subclasses like `Zombie.java` and `Skeleton.java` extend `Enemy.java` while maintaining expected behaviors.
- A `Zombie` can replace any `Enemy` instance without breaking functionality.
## Interface Segregation Principle (ISP)
The refactored code introduces focused interfaces:
- `IAttackable.java` defines attack behavior.
- `IDamageable.java` ensures consistent damage handling.
- `IItem.java` provides item functionality.
## Dependency Inversion Principle (DIP)
High-level modules depend on abstractions rather than concrete implementations:
- `CombatManager.java` interacts with `IEnemy`, not specific enemy classes.
- `ItemManager.java` depends on `IItem`, allowing flexible item management.
## Conclusion
Applying SOLID principles results in a modular, scalable, and maintainable codebase. Future enhancements, such as new enemies, items, or mechanics, can be easily integrated without modifying existing classes.
## UML Diagrams
- **Before Refactoring**: A monolithic structure with multiple responsibilities in a single class.
- **After Refactoring**: A modular design with clear separations based on responsibilities.

