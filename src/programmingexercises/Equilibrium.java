/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

/**
 *
 * @author Alex
 */
public class Equilibrium {
    

    
        public int solution(int[] A) {
            
            for(int i= 0; i < A.length; i++){
                int num = 0;
                int lower = 0;
                while(num <= i){
                    lower+=A[num];
                num++;
                }
                int upper = 0;
                num=0;
                while(num < A.length){
                    upper+=A[num];
                num++;
                }
                if(lower == upper){
                    return A[i];
                }
                
            }
            
            return -1;
        
        }
        
        
        public static void main(String[]args){
            int[]test ={-4, 3, 2, 6, -4, 2};
            Equilibrium testClass = new Equilibrium();
            System.out.println(testClass.solution(test));
                 
        }
    
}
