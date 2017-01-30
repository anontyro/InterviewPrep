/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class ProgrammingExercises {

    private void userSelect() {
        System.out.println("Select which module to view, input the first letter");
        for (Classes c : Classes.values()) {
            System.out.println(c);
        }
        Scanner scanner = new Scanner(System.in);

        char selected = (scanner.nextLine()).trim().toLowerCase().charAt(0);
        if (selected == 'f') {
            FizzBuzz fizzBuzz = new FizzBuzz(1, 101);
        } else if (selected == 'u') {
            UniqueCharactersOnly unique = new UniqueCharactersOnly();
        } else if(selected == 'p'){
            System.out.println("Enter A word to check if it is a Palindrome: ");
            Scanner scan = new Scanner(System.in);
            String userWord = scan.nextLine();
            Palindrome palindrome = new Palindrome(userWord);
        } else {
            System.out.println("No class found for the letter");
        }
        
        reRun();

    }
    
    private void reRun(){
        System.out.println( "\n"+
                "----------------------------------------------------");
        System.out.println("Would you like to try another program? y/n");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(userInput.charAt(0) == 'y'){
            userSelect();
        }else{
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    /**
     * enum class to iterate over and produce the list for the user to pick from
     */
    protected enum Classes {
        Fizzbuz, UniqueString, Palindrome
    }

    public static void main(String[] args) {
        ProgrammingExercises ex = new ProgrammingExercises();
        ex.userSelect();
    }

}
