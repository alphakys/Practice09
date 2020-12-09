package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp2 {

    public static void main(String[] args) {
    	Rectangle2 r1 = new Rectangle2(5,6);
    	Rectangle2 r2 = new Rectangle2(5,6);
    	r2.resize(0.5);
    	
    	RectTriangle2 rT1 = new RectTriangle2(6,2);
    	
    	
    	
        ArrayList<Shape> sArr = new ArrayList<>();
        
        sArr.add(r1);
        sArr.add(r2);
        sArr.add(rT1);
        
        
        for(Shape s : sArr) {
        	System.out.println("area: "+s.getArea());
        	System.out.println("perimeter: "+s.getPerimeter());
        	
        	
        	
        }
    	
    	
    }
}
