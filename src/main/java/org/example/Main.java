package org.example;

public class Main {
    private Player p = new Player("Dmytro", 20, 6, 100);
    private Monster m = new Monster("HeadHunter", 10, 8, 150);

    public static void main(String[] args) {
        new Main().start();
    }

    public void start(){
        printE();

        p.attack(m);
        p.attack(m);
        p.attack(m);

        m.attack(p);
        m.attack(p);
        m.attack(p);

        printE();
    }

    private void printE(){
        System.out.println(p);
        System.out.println(m);
    }
}