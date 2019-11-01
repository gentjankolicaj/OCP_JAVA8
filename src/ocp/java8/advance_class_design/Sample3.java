package ocp.java8.advance_class_design;

public class Sample3 {

	enum IceCreams{
		
		VANILLA,CHOCOLATE,STRAWBERRY
	}
	public static void main(String[] args) {
		
		IceCreams[] enumArrayValues=IceCreams.values();
		
		for(IceCreams iceCream:enumArrayValues)
			System.out.println(iceCream.ordinal()+" "+iceCream.name());

	}

}
