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
        } else {
            System.out.println("No class found for the letter");
        }

    }

    protected enum Classes {
        Fizzbuz, UniqueString
    }

    public static void main(String[] args) {
        ProgrammingExercises ex = new ProgrammingExercises();
        ex.userSelect();
    }

}
