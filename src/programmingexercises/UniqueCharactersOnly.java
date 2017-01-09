
package programmingexercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Simple class to test if a string entered has any repeating characters, using a
 * double loop
 * @author Alex
 */
public class UniqueCharactersOnly {
    private String stringValue = "";
    
    public UniqueCharactersOnly(){
        getUserString();
    }
    
    private void getUserString(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to compare");
        String values = scanner.nextLine();
        
        System.out.println("You have entered: "+values);
        
        if(uniqueString(values) == true){
            System.out.println("Unique String!");
        }else{
            System.out.println("Not a unique string");
        }
    }
    
    private boolean uniqueString(String userVal){
        
        
        for(int i=0; i < userVal.length(); i++){
            
            for(int j = i+1; j<userVal.length();j++){
                if(userVal.charAt(i) == userVal.charAt(j)){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    
    
    
}
