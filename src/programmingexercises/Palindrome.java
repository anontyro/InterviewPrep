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
public class Palindrome {
    
    private String userPalindrome = "";
    
    public Palindrome(String userPalindrome){
        this.userPalindrome = userPalindrome;
        
        if(!checkLength(userPalindrome)){
            System.out.println(userPalindrome + " Doesn't have an even number of letters");
        }else{
            if(checkPalindrome(userPalindrome)){
                System.out.println(userPalindrome + " Great this is a palindrome");
            }else{
                System.out.println("Sorry no dice, " +userPalindrome + " isn't a palindrome");
            }
        }
        
    }
    
    private boolean checkLength(String userPalindrome){
        System.out.println("String is: "+userPalindrome.length());
        if(userPalindrome.length() %2 != 0){
            return false;
        }
        return true;
    }
    
    private boolean checkPalindrome(String userPalindrome){
        
        for(int i = 0; i < (userPalindrome.length()/2);i++){
            if(userPalindrome.charAt(i) != userPalindrome.charAt((userPalindrome.length()-1) - i)){
                return false;
            }
        }
        
        return true;
    }
    
    
    
}
