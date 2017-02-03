/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercises;

import java.util.Arrays;
import java.util.*;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author Alex
 */
public class TestPrograms {

    public String solution1(String S) {
        String output = "";
        String temp = "";
        System.out.println(S);
        for (int i = S.length() - 1; i >= 0; i--) {
            temp += S.charAt(i);
        }
        String[] words = temp.split("\\s");
        for (int i = words.length - 1; i >= 0; i--) {
            output += words[i] + " ";
        }
        output = output.trim();

        return output;
    }

    public int solution2(int[] A, int[] B) {
        ArrayList<Integer> myList = new ArrayList<>();
        int value = -1;
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    System.out.println(A[i] + " " + B[j]);
                    myList.add(Integer.valueOf(A[i]));
                }
            }
            Collections.sort(myList);

            if (myList.size() > 0) {
                value = myList.get(0);
            }

        }
        return value;
    }

    int solution3(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else if(A[m] < X){
                l = m;
            } else{l =m; break;}
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }

    public boolean solution4(int[] A) {
        int firstSwap = -1;
        int firstIndex = 0;
        int secondSwap = -1;
        int secondIndex = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] >= A[i + 1]) {
                if (firstSwap == -1) {
                    firstSwap = A[i];
                    firstIndex = i;
                } else if (secondSwap == -1) {
                    secondSwap = A[i + 1];
                    secondIndex = i + 1;
                } else if (firstSwap != -1 && secondSwap != -1) {
                    break;
                }
            }
        }
        if (secondSwap == -1 && firstSwap != -1) {
            for (int i = 0; i < A.length - 1; i++) {
                if (firstSwap > A[i]) {
                    secondSwap = A[i];
                    secondIndex = A[i];
                    break;
                }
            }
        }

        A[firstIndex] = secondSwap;
        A[secondIndex] = firstSwap;

        int flag = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                flag = 1;
            }

            System.out.println(A[i] + " -> " + A[i + 1]);
        }

        if (flag != 1) {
            return true;
        } else {
            return false;
        }

    }

//    public int solution(Tree T) {
//        
//    }

    public static void main(String[] args) {
        int[] swapper = {1, 5, 3, 3, 7};
        TestPrograms progs = new TestPrograms();
        ;

//        System.out.println(progs.solution(swapper));

    }

}
