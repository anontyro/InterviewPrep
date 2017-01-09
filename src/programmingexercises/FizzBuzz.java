package programmingexercises;

import java.util.ArrayList;

/**
 * Basic class which will test for the Fizz Buzz idea between chosen parameters
 * @author Alex
 */
public class FizzBuzz {
    int start;
    int end;
    
    public FizzBuzz(int start, int end){
        this.start = start;
        this.end = end;
        
        fizzyLoop();
        
    }
    
    private ArrayList<String> fizzyLoop(){
        ArrayList fizzList = new ArrayList<>();
        
        for(int i = start; i < end; i++){
            if(i % 3 == 0 && i % 5 == 0 ){
                System.out.println("FizzBuzz");
            }else if(i % 3 ==0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
        
        return fizzList;
    }
    
}
