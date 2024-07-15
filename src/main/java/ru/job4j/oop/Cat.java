package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("имя котика " + this.name + ", он ел " + this.food);
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("steak");
        gav.giveNick("Гав");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Большой черный кот");
        black.show();
    }
}