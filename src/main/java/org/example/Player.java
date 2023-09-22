package org.example;

public class Player extends Entity{

    private int healing = 4;

    public Player(String name, int attack, int shield, int health) {
        super(name, attack, shield, health);
    }

    public void heal(){
        if(healing>0) {
            super.addHealth(30);
            System.out.println(this.getName() + " use heal\n");
        }else
            System.out.println(this.getName() + " doesn't have healing\n");
    }

    @Override
    public String toString(){
        return "PLAYER "+super.toString();
    }
}
