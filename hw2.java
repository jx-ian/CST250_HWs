package hw2;

import java.util.Arrays;

/**
 * @author jiahaoxian
 */
public class HW2 {

    public static void main(String[] args) {

        //program1
        int [] array1 = {1, 5, -5, 2, 12, 30};
        int [] array2 = {-10, 50, 15, 2};

        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < array2.length; k++) {
                if (array1[i] == array2[k]) {
                    System.out.println("The common value is " + array1[i] + ".");
                    break;
                }
            }
        }

        
        //program2
        int [] array3 = {1, 77, -5, 2, 65, 30};
        int [] array4 = {-10, 50, 15, 2, 77};
        int find1 = 65;
        int find2 = 77;
        boolean found1 = false;
        boolean found2 = false;

        for (int i = 0; i < array3.length; i++) {
            for (int k = 0; k < array3.length; k++) {
                if (array3[i] == find1 && array3[k] == find2) {
                    found1 = true;
                    break;
                }
            }
        }

        if (found1 == true) {
            System.out.println(Arrays.toString(array3) + " contains both 65 and 77.");
        } 
        else {
            System.out.println(Arrays.toString(array3) + " doesn't contain both 65 and 77.");
        }
        
        for (int i = 0; i < array4.length; i++) {
            for (int k = 0; k < array4.length; k++) {
                if (array4[i] == find1 && array4[k] == find2) {
                    found2 = true;
                    break;
                }
            }
        }

        if (found2 == true) {
            System.out.println(Arrays.toString(array4) + " contains both 65 and 77.");
        } 
        else {
            System.out.println(Arrays.toString(array4) + " doesn't contain both 65 and 77.");
        }
        
        
        //program3
        char [] array5 = {'s', 'a', 'b', 'a'}; 
        
        for (int i = array5.length-1; i >= 0; i--) {
            System.out.println(array5[i]);
        }
        
        
        //program4
        String myString1 = "Saba";
        String myString2 = "John";
        boolean true1 = false;
        boolean true2 = false;
        
        for (int i = 0; i < myString1.length(); i++) {
            for (int k = i + 1; k < myString1.length(); k++) {
                if (myString1.charAt(i) == myString1.charAt(k)) {
                     true1 = true;
                     break;
                }
            }
        }
        
        if (true1 == true) {
            System.out.println(myString1 + " doesn't have unique characters.");
        }
        else {
            System.out.println(myString1 + " has unique charactors.");
        }
        
        for (int i = 0; i < myString2.length(); i++) {
            for (int k = i + 1; k < myString2.length(); k++) {
                if (myString2.charAt(i) == myString2.charAt(k)) {
                     true2 = true;
                     break;
                }
            }
        }
        
        if (true2 == true) {
            System.out.println(myString2 + " doesn't have unique characters.");
        }
        else {
            System.out.println(myString2 + " has unique charactors.");
        }
        
        
        //program5
        String myString3 = "madam";
        String myString4 = "test";
        String reverseMyString3 = "";
        String reverseMyString4 = "";
        
        for (int i = (myString3.length()-1); i >=0; i--) {
            reverseMyString3 = reverseMyString3 + myString3.charAt(i);
        }
        
        if (myString3.equals(reverseMyString3)) {
            System.out.println(myString3 +" is a palindrome string to '" + reverseMyString3 + "'.");
        }
        else {
            System.out.println(myString3 + " is not a palidrome string to '" + reverseMyString3 + "'.");
        }
        
        for (int i = (myString4.length()-1); i >=0; i--) {
            reverseMyString4 = reverseMyString4 + myString4.charAt(i);
        }
        
        if (myString4.equals(reverseMyString4)) {
            System.out.println(myString4 +" is a palindrome string to '" + reverseMyString4 + "'.");
        }
        else {
            System.out.println(myString4 + " is not a palidrome string to '" + reverseMyString4 +"'.");
        }
        
        
        //program6
        String myString5 = "hello everyone. let's write some useful Java code today. we will begin with strings.";
        char [] capMyString5 = myString5.toCharArray();
        
        for (int i = 0; i < capMyString5.length; i++) {
            if (myString5.charAt(i) == ".".charAt(0) && i + 1 < capMyString5.length) {
                capMyString5[0] = String.valueOf(String.valueOf(capMyString5[0])).toUpperCase().charAt(0);
                capMyString5[i + 2] = String.valueOf(String.valueOf(capMyString5[i + 2])).toUpperCase().charAt(0);
            }
        }

        System.out.println(String.valueOf(capMyString5));
    }
}
