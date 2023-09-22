package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Entity {

    private String name;
    private int attack;
    private int shield;

    private int health;
    private int maxHealth;

    private int[] damage = {1,2,3,4,5,6};

    public Entity(String name, int attack, int shield, int health){
        this.name = name;
        this.attack = attack;
        this.shield = shield;
        this.health = health;
        this.maxHealth = health;
    }

    public void attack(Entity entity){
        int attackMod = this.attack - entity.shield;
        List<Integer> throwsList = new ArrayList<>();
        for(int i=0;i<attackMod;i++){
            throwsList.add(new Random().nextInt(6)+1);
        }

        System.out.println("Throws:\n"+throwsList);

        if(throwsList.contains(5) || throwsList.contains(6))
            successAttack(entity);
        else
            failedAttack(entity);
    }

    private void failedAttack(Entity entity){
        System.out.println(entity.name+" was unsuccessfully attacked by " +this.name+"\n");
    }

    private void successAttack(Entity entity){
        System.out.println(entity.name+" was successfully attacked by "+this.name);
        int damage = this.damage[new Random().nextInt(6)];
        System.out.println("Damage: "+damage+"\n");
        entity.health-=damage;
    }

    public void addHealth(int percent){
        int healCount = maxHealth*percent/100;

        if(healCount+this.health>maxHealth)
            this.health = maxHealth;
        else
            this.health+=healCount;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getShield() {
        return shield;
    }

    public int getHealth(){
        return health;
    }

    public int[] getDamage(){
        return damage;
    }

    @Override
    public String toString(){
        return this.name+" "+" А: "+this.attack+" Щ:"+this.shield+" З:"+this.health+"\n";
    }
}
