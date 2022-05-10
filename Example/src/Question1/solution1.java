/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

/**
 *
 * @author nhut0
 */
public class solution1 {
        public static int findStep (int nStep){
            
            if(nStep ==0)return 1;
            else if(nStep<0){
             return 0;
            }
            else {
                return findStep(nStep-2)+ findStep(nStep-1);
            }
        }
}
