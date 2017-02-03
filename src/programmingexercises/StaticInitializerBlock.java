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
public class StaticInitializerBlock {
    static boolean flag = false;
    static int B = 10;
    static int H = 5;
    static{
      if(B > 0 && H > 0){
          flag = true;
      }else{
          System.out.println("Error values must be possitive");
      }

    }
    
    
    public static void main(String[]args){
        
        if(flag){
            int area=B*H;
            System.out.println(area);
            
        }
    }
    
}
