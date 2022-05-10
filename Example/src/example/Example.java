/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example;

import Question1.solution1;
import Question2.solution2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nhut0
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("nhập số step: ");
        Scanner scanner = new Scanner(System.in);
        int step =0;
        step = scanner.nextInt();
        System.out.println(solution1.findStep(step));
        
        
        System.out.println("nhập input: ");
         int input =0;
        input = scanner.nextInt();
       
       solution2.result(input);
      
    }
    
}
