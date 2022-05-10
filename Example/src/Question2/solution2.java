/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author nhut0
 */


public class solution2 {
    
    
 
    public void result(int input){
        char[] output = new char[2 * input];
        output[0] = '(';
        output[1] = ')';
        foo(output, 1, input - 1, input, input);
        
    }

   public void foo(char[] output, int index, int open, int close,
        int pairs) {
    int i;

    if (index == 2 * pairs) {
        for (i = 0; i < 2 * pairs; i++)
            System.out.print(output[i]);
        System.out.println('\n');
        return;
    }

    if (open != 0) {
        output[index] = '(';
        foo(output, index + 1, open - 1, close, pairs);
    }

    if ((close != 0) && (pairs - close + 1 <= pairs - open)) {
        output[index] = ')';
        foo(output, index + 1, open, close - 1, pairs);
    }

    return;
   }
     
}
