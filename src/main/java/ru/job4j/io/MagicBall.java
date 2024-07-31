package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int random = new Random().nextInt(3);
        String answer;
        if (random == 0) {
            answer = "Да!";
        } else if (random == 1) {
            answer = "Нет!";
        } else {
            answer = "Не знаю!";
        }
        System.out.println(answer);
    }
}