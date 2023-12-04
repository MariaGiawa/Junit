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
package JUnit_Reverse1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class Reverse1 {
    public String methodReverse_1(int n){
        String hasil;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r;
        int rev = 0;
        int number = n;
        
        while(n>0){
            r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        
        hasil = "The reverse of "+number+ " is "+rev;
        return hasil;
    }
}

