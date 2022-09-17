/*

 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mahdi
 */
import java.util.*;
import java.util.stream.*;
public class Array {
    public static void main(String[] args){
        int[] intArray = {10,20,30,40,50,60,70};
        
        //print array starting from first element
        System.out.print("Original Array");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i]+" ");
        
        System.out.println( );
        
        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i]+" ");
    }
    
}
