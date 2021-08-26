/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ispalindrome;

import java.io.*;

public class ConsoleInput {
    BufferedReader reader;
    
    public ConsoleInput(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public int readInt()throws IOException{
        return Integer.parseInt(reader.readLine());
    }
    
    public double readDouble()throws IOException{
        return Double.parseDouble(reader.readLine());
    }
    
    public String readStr()throws IOException{
        return reader.readLine();
    }
}