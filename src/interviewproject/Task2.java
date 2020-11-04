/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mspace-dev
 */
public class Task2 {
    private static List<int[]> findSum(int[] inputArray, int total){
        List<int[]> quads = new ArrayList<>();
        List<int[]> success = new ArrayList<>();
        
        for(int i=0; i<inputArray.length; i++){
            int[] quad = new int[4];
            for(int j=0; j<4; j++){
                int index=0;
                if(i+j >= inputArray.length){
                    index = i+j - inputArray.length;
                }else{
                    index = i+j;
                }
                quad[j] = inputArray[index];
            }
            quads.add(quad);
            System.out.println(String.format(":: Quad added [%d, %d, %d, %d]", quad[0],quad[1],quad[2],quad[3]));
        }
        
        for(int[] quad: quads){
            int sum = quad[0]+quad[1]+quad[2]+quad[3];
            if(sum==total){
                System.out.println(String.format(":: Success found [%d, %d, %d, %d]", quad[0],quad[1],quad[2],quad[3]));
                success.add(quad);
            }
        }
        
        return success;
    }
    public static void main(String[] args) {
        int[] inputArray = {7, 6, 4, -1, 1, 2};
        findSum(inputArray, 16);        
    }
    
}
