/**
 * 
 */
package com.lq.exercises;

/**
 * 
 */
public class BoxDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// EX 1
		
		Box box1 = new Box (5, 6, 7);
		Box box2 = new Box(10);
		
		System.out.println("Box 1 length is " + box1.getLength());
		System.out.println("Box 1 width is " + box1.getWidth());
		System.out.println("Box 1 height is " + box1.getHeight());
		System.out.println("Box 2 length is " + box1.getLength());
		System.out.println("Box 2 width is " + box1.getWidth());
		System.out.println("Box 1 height is " + box1.getHeight());
		
		// EX 2
		
		box1.setLength(3);
		box1.setWidth(4);
		box1.setHeight(5);
		System.out.println("Box  box1 lenght =" + box1.getLength() + ", width =" + box1.getWidth() + ", height =" + box1.getHeight());
		System.out.println("The volume of Box box1 is " + box1.getVolume());
		System.out.println("the surface area of Box Box1 is " + box1.getSurfaceArea());
		
		box1.printBox();
		
		box1.setLength(-5);
		box1.printBox();
		
		box1.setWidth(-10);
		box1.setHeight(0);
		box1.printBox();
		
		// Challenge EX
		
		Box box3 = new Box (7, -4, 0);
		box3.printBox();

	}

}
