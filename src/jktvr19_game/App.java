/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19_game;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class App {
    private String repeat = "y";
    public void  run(){
        System.out.println("Игра - Угадай число, есть три попытки");
        do {
            System.out.println("Компьютер загадал число от 0 до 5.");

            //int min = Scanner(System.in);
            
            

            System.out.print("\nВведите свое число: ");
            Scanner scanner = new Scanner(System.in);
            int number1 = 0;
            int attempt = 0;
            
            do {       
                try {
                    number1 = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Неправильный ввод");
                    System.exit(0);
                }

                Random random = new Random();
                int myNumber = random.nextInt(5-0+1)+0;
                int a = (int) ( Math.random() * 10+1 );
                // System.out.println (a);

                if (myNumber == number1) {
                    System.out.println("\nВы угадали");
                    System.out.print("Число компьютера:");
                    System.out.println(myNumber);
                }else {
                    if (attempt < 2) {
                        System.out.println("\nВы не угадали, попробуйте еще раз:");
                    } else {
                    System.out.print("Число компьютера:");
                    System.out.println(myNumber);
                    break;
                    }
                    attempt++;
                }
            } while (true);
            
            System.out.println();
            System.out.println("Для продолжения нажмите \"y\", для выхода нажмите любую другую клавишу");
            repeat = scanner.nextLine();
        }
        while(repeat.equals("y"));
    
    }
    
}
