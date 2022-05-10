/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nhut0
 */


public class solution2 {
    
    
 
    public static void result(int input){
        int   n = 3;
     
        ArrayList<String> ans = new ArrayList<>();
        find(input, 0, 0, "", ans);
        for (String s : ans) {
            System.out.println(s);
        }
        
    }

   public static void find(int n, int open, int close,
                     String s, ArrayList<String> ans)
   {
        if (open == n && close == n) {
            ans.add(s);
            return;
        }
       
        if (open < n) {
            find(n, open + 1, close, s + "(",
                                ans);
        }
        if (close < open) {
            find(n, open, close + 1, s + ")",
                                ans);
        }
    }
    
}
