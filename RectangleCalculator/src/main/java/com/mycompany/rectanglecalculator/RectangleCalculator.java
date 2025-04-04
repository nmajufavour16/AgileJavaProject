/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectanglecalculator;

/**
 *
 * @author X360 1040
 */
public class RectangleCalculator {

    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    
    public static void main(String[]args) {
        double length = 5.0;
        double width = 3.0;
        System.out.println("Area: " + calculateArea(length, width));
        System.out.println("Perimeter: " + calculatePerimeter(length, width));
    }
}
