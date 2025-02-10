package combat;

import enemies.IEnemy;

public class CombatManager {
    public void fight(Player player, IEnemy enemy) {
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            player.takeDamage(enemy.attack());
            enemy.takeDamage(player.attack());
        }
    }
}