/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mahdi
 */
public class ReverseArray {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50,60};
        System.out.println("Original Array:");
        for(int i=0; i<array.length;i++)
            System.out.print(array[i]+" ");
        
        System.out.println("Original array in reverse order:");
        for(int i=array.length-1;i>=0 ;i--)
        System.out.print(array[i]+" ");
    }
}
