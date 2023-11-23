package Recursion.Basics;

public class Easy {

    public static void main(String[] args) {
//          printNumber(10);
//          printReverseString("Harsh",0);
        char[] myArray = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        reverseString(myArray);
    }

    // print 1toN integers
    public static void printNumber(int num){
        if(num == 1){
            System.out.print(num + " ");
            return;
        }
        printNumber(num-1);
        System.out.print(num + " ");
    }

    // print string in reverse order
    public static void printReverseString(String str,int index){
        if(str == null || index >= str.length()){
            return ;
        }
        printReverseString(str,index + 1);
        System.out.println(str.charAt(index) + " ");
    }


    // A variation of above
    public static void reverseString(char[] s) {
        char[] answer = new char[s.length];
        helper(s,0,s.length -1,answer);
    }
    public static void helper(char[] s, int startIdx, int endIdx, char[] answer) {
        if (startIdx >= s.length || endIdx == -1) {
            return;
        }
        helper(s, startIdx + 1, endIdx - 1, answer);
        answer[startIdx] = s[endIdx];
    }



}
