/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ispalindrome;

import java.io.IOException;

/**
 *
 * @author caggi
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "";
        Boolean b = true;
        ConsoleInput input = new ConsoleInput();
        try {
            System.out.println("inserisci string");
            s = input.readStr();

            Integer j = s.length();

            for (Integer i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j - i - 1)) {
                    b = false;
                    System.out.println(b);
                    return;
                } else {
                    b = true;
                }
            }
            System.out.println(b);
        } catch (IOException io) {
            System.out.println("errore inserimento");

        }
    }
}
