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
package JUnit_Palindrome1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author USER
 */
public class Palindrome1 {
    public String methodPalindrome_1(int n1){
        String hasil;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r, n2;
        int rev=0;
        n2=n1;
        while(n1>0){
            r = n1%10;
            rev = rev*10+r;
            n1 = n1*10;
        }
        if(rev==n2){
            hasil = "palindrome number!";
        } else{
            hasil = "NOT palindrome number!";
        }
        return hasil;
    }
}
