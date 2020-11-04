/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewproject;

import java.util.Scanner;

/**
 *
 * @author mspace-dev
 */
public class TextSwap {
    
    private static String swapText(String text, int key){
        String letters = "abcdefghijklmnopqurstuvwxyz";
        String output = "";
        for(int i=0; i<text.length(); i++){
            Character c = text.charAt(i);
            int pos = letters.indexOf(c);
            //System.out.println("POS::"+pos);
            if(pos+key >= letters.length()){
                Character nextChar = letters.charAt((pos+key) - letters.length());
                output += nextChar;
            }else{
                Character nextChar = letters.charAt((pos+key));
                output += nextChar;                
            }            
        }     
        return output;
    }
    
    public static void main(String[] args) {
        String example;
        int key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        example = scanner.nextLine().toLowerCase();
        System.out.println("Enter the key value:");
        key = scanner.nextInt();        
        String result = swapText(example, key);
        System.out.println(result);
    }
    
}
