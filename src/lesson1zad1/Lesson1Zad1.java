//Дано значение температуры T в градусах Цельсия.
//Определить значение этои же температуры по
//Фаренгейту. Температура по Цельсию TC и
//температура по Фаренгейту TF связаны следующим
//соотношением: TC = (TF – 32)·5/9
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1zad1;

import java.util.Scanner;

/**
 *
 * @author Kasutaja
 */
public class Lesson1Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float tf, tc;
        System.out.println("Vvedite znachenie temperatury v gradusah po Tsel'siyu: ");
        Scanner scanner = new Scanner(System.in);
        tc = scanner.nextFloat();
        tf = (float) (1.8 * tc + 32);
        System.out.println("Temperatura po Farengeity: " + tf);
    }
    
}
