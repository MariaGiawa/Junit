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
package JUnit_Reverse2;

/**
 *
 * @author USER
 */
public class Reverse2 {
     public String methodReverse_2(String original){
        String hasil;
        String reverse = "";
        int length = original.length();
        for(int i=length-1; i>0; i--)
            reverse = reverse + original.charAt(i);
        
        hasil = "The reverse of "+original+" is "+reverse;
        return hasil;
    }
}
