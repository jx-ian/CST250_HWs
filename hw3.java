package hw3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author jiahaoxian
 */

public class Hw3 {

    public static void main(String[] args) {
        
        //Program1
        Queue<Integer> minValue = new LinkedList();
        
        minValue.add(55);
        minValue.add(632);
        minValue.add(12);
        minValue.add(-82);
        minValue.add(1);
        minValue.add(74);
        minValue.add(23);
        minValue.add(-58);
        minValue.add(86);
        minValue.add(-35);
        
        int min = -1;
        
        for(int i : minValue) {
            if (min == -1) {
                min = i;
            }
            else if (i < min) {
                min = i;
            }
            else if (i < i) {
                min = i;
            }
        }
        
        System.out.println("Queue: " + minValue);
        System.out.println("The minimum value in the queue is " + min + ".");
        
        
        //Program2
        String pali = "racecar";
        String reversePali = "";
        
        Stack<Character> palindrome = new Stack();
        
        for(int i = (pali.length()-1); i >= 0; i--) {
            reversePali = reversePali + palindrome.push(pali.charAt(i));
        }
        
        if (pali.equals(reversePali)) {
            System.out.println(pali + " is a palindrome to " + reversePali);
        }
        else {
            System.out.println(pali + " is not a palindrome to " + reversePali);
        }
        
        
        //Program3
        String question1 = "(3*4)+7/2)";
        String question2 =   "(((8*8-2) + 9 - (12*5)) - 2 )";
        byte q1LP = 0;
        byte q1RP = 0;
        byte q2LP = 0;
        byte q2RP = 0;
        
        Stack<Character> parentheses = new Stack();
        
        for(char q1 : question1.toCharArray()) {
            if(q1 == '(' ) {
                parentheses.push(q1);
                q1LP++;
            }
            else if(q1 == ')') {
                parentheses.push(q1);
                q1RP++;
            }
        }
        
        if(q1LP == q1RP) {
            System.out.println("The expression: " + question1 + " is equally balanced with " + q1LP + " left parentheses and " + q1RP + " right parentheses. They are: "+ parentheses);
        }
        else {
            System.out.println("The expression: " + question1 + " is not equally balanced with " + q1LP + " left parentheses and " + q1RP + " right parentheses. They are: "+ parentheses);
        }
        
        
        Stack<Character> parentheses2 = new Stack();
        
        for(char q2 : question2.toCharArray()) {
            if(q2 == '(' ) {
                parentheses2.push(q2);
                q2LP++;
            }
            else if(q2 == ')') {
                parentheses2.push(q2);
                q2RP++;
            }
        }
        
        if(q2LP == q2RP) {
            System.out.println("The expression: " + question2 + " is equally balanced with " + q2LP + " left parentheses and " + q2RP + " right parentheses. They are: "+ parentheses2);
        }
        else {
            System.out.println("The expression: " + question2 + " is not equally balanced with " + q2LP + " left parentheses and " + q2RP + " right parentheses. They are: "+ parentheses2);
        }
    }
}
