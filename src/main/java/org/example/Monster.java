package org.example;

public class Monster extends Entity{
    public Monster(String name, int attack, int shield, int health) {
        super(name, attack, shield, health);
    }

    @Override
    public String toString(){
        return "MONSTER "+super.toString();
    }
}
