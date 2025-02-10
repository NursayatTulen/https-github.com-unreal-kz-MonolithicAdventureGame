/ 🏹 Monolithic Adventure Game – SOLID Refactoring  
// 📌 Project Overview  
This project is a **refactored version** of a previously **monolithic Adventure Game**, now structured according to **SOLID principles**.  
The main goal was to improve **code readability, maintainability, and scalability**.  
/// 🔧 Key Changes  
1. **Decoupled the monolithic class into separate components**  
2. **Applied SRP (Single Responsibility Principle)** – Each class now has a **single responsibility**  
3. **Ensured OCP (Open/Closed Principle)** – New enemies and items can be added **without modifying existing code**  
4. **Implemented DIP (Dependency Inversion Principle)** – Reduced **tight coupling** by using interfaces  
5. **Followed LSP (Liskov Substitution Principle) and ISP (Interface Segregation Principle)** – Made sure subclasses can **replace** their parent classes without breaking the system  

## 🏗 Folder Structure  
```
📂 SOLID-Refactored-AdventureGame
│── 📂 src
│   ├── 📂 player
│   │   ├── Player.java
│   ├── 📂 combat
│   │   ├── CombatManager.java
│   ├── 📂 enemies
│   │   ├── Enemy.java
│   │   ├── Skeleton.java
│   │   ├── Zombie.java
│   │   ├── Vampire.java
│   ├── 📂 items
│   │   ├── ItemManager.java
│   │   ├── GoldCoin.java
│   │   ├── HealthElixir.java
│   │   ├── MagicScroll.java
│   ├── 📂 level
│   │   ├── LevelManager.java
│   ├── 📂 score
│   │   ├── ScoreManager.java
│   ├── MainGame.java
│
│── 📂 docs
│   ├── UML-Before-Refactor.png
│   ├── UML-After-Refactor.png
│   ├── SOLID-Refactoring-Report.pdf
│
│── README.md
```
## 🚀 How to Run  
1. Clone the repository:  
   ```sh
   git clone https://github.com/NursayatTulen/https-github.com-unreal-kz-MonolithicAdventureGame.git
   cd SOLID-Refactored-AdventureGame
   ```
2. Compile and run the game:  
   ```sh
   javac src/MainGame.java  
   java src.MainGame
   ``
## 📚 Documentation  
- **UML Diagrams**: Before and after refactoring (`docs/UML-After-Refactor.png`)  
- **Refactoring Report**: Detailed explanation of **how SOLID principles were applied** (`docs/SOLID-Refactoring-Report.pdf`)  
## 🎯 Future Improvements  
- Add **new enemy types** dynamically  
- Implement **a better scoring system**  
- Improve **combat mechanics with special attacks**  
---
🛠 **Developed as part of a SOLID refactoring assignment**.  
