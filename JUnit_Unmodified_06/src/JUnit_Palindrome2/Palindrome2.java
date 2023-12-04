/*
Kelompok 06 PA2
1.	11321019	Elsaday Sianturi
2.	11321044	Yudhi Purba
3.	11321069	Maria Fransiska Giawa
4.	11321071	Putri Wita Marito

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit_Palindrome2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Palindrome2 {
    public String methodPalindrome_2(String original){
        String reverse = "";
        String hasil;
        Scanner in = new Scanner(System.in);
        
        int length = original.length();
        
        for(int i=length-1; i>=0; i--)
            reverse = reverse + original.charAt(i);
        if(original.equals(reverse))
            hasil = "palindrome string!";
        else
            hasil = "NOT palindrome string!";
        return hasil;
    }
}
