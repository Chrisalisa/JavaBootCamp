package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		Rectangle kaste=new Rectangle(5, 6);
		kaste.setColor("Blue");
		System.out.println("The perimeter is= "+kaste.calculatePerimeter());
		System.out.println("The area is= "+kaste.calculateArea());
		System.out.println("The color is= "+kaste.getColor());
		
		

	}

}
