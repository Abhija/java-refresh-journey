package com.oops.samplesandnotes.overloading;

public class ShapeMain {
    public static void main(String[] args) {
    	
    	//Why Method over laoding
    	//If you want to calculate the area of different shapes
    	//(like a square, rectangle, or circle), 
    	//instead of creating methods named calculateSquareArea(),
    	//calculateRectangleArea(), and calculateCircleArea(),
    	//you can use the single, consistent name area()
    	//
    	//The programmer using the class doesn't need to change the method name/
    	//whether they're adding two integers, two doubles, or three integers.
    	//
        Shape shape = new Shape();
        shape.area(10);
        shape.area((int)10.5f);
        shape.area(10.5f);
        int rect = (int)shape.area(10, 20);
//        int rect = shape.area(10, 20);
        System.out.println("Rect "+rect);
        float tri = shape.area(12, (int)10.0f); // This line has a type mismatch error in the original code, but I'm extracting what's written.
//        float tri = shape.area(12, 10.0f);
        System.out.println("Tri "+tri);
    }
}