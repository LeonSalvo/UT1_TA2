/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut1_ta2;

/**
 *
 * @author Leon
 */
public class UtilMath {
    public static int factorial(int num){
        int factorial = 1;
        for (int i = num ; i >= 1; i--){
            factorial *= i;
        }
        return factorial;
        
    }
    
}
