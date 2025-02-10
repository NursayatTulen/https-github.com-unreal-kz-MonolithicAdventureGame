package player;

import items.IItem;

public class Player {
    private int health;
    private int experience;
    private IItem[] inventory;

    public Player(int health, int experience) {
        this.health = health;
        this.experience = experience;
        this.inventory = new IItem[10]; // Example inventory size
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void addItem(IItem item) {
        
    }

}