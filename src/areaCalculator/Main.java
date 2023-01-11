package areaCalculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaOfRectangle r = new areaOfRectangle(5,7);
		System.out.println(r.getArea());
		
		r.setLength(10);
		System.out.println(r.getArea());
	}

}
