package Recursion.Basics;

import java.util.HashMap;
import java.util.Scanner;

public class InputOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element");

        String getInput = input.nextLine();

        printUniqueSubset(getInput, new HashMap<String,String>(),0,"");
        System.out.println(" ");
        printSubset(getInput,0,"");
    }

    // print all subsets of given string
    public static void printSubset(String str, int index, String currentSubset){

        if(index == str.length() ){
            System.out.print(currentSubset + " ");
            return;
        }

        // include the current element
        printSubset(str,index+1, currentSubset + str.charAt(index));

        // does not include the current element
        printSubset(str,index+1, currentSubset );

    }

    // print all unique subsets of given string
    public static void printUniqueSubset(String str, HashMap<String,String> map,int index ,String currentSubset ){

        if(index == str.length() ){
            if (!map.containsValue(currentSubset)) {
                map.put(currentSubset, currentSubset);
                System.out.print(currentSubset + " ");
            }
            return;
        }

        // include the current element
        printUniqueSubset(str, map,index+1, currentSubset + str.charAt(index));

        // does not include the current element
        printUniqueSubset(str,map,index+1, currentSubset );
    }

}
