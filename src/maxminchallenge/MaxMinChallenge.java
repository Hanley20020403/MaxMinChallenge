/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxminchallenge;

import java.util.Scanner;

/**
 *
 * @author hahan0750
 */
public class MaxMinChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in);
        
        final int LENGTH = 10;
        int [] nums = new int[LENGTH];
        int max;
        int min;
        
        for (int i=0; i<LENGTH; i++)
        {
            nums[i] =(int)(Math.random()*100+1);
           
        }
        
        max = nums[0];
        min = nums[0];
        for (int i=1; i<LENGTH; i++)
        {
            
            if(max<nums[i])
            {
                max = nums[i];
            }      
             if(min>nums[i])
            {
                min = nums[i];
            }  
        }
        
        for(int i=0;i<LENGTH; i++)
        {
            System.out.print(nums[i] + ", ");
        }
        
        System.out.println("\n"+ max);
        System.out.println(min);
        
        
        
        
    }
    
}
