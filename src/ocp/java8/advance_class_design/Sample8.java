package ocp.java8.advance_class_design;

public class Sample8 {

	String name = "Sample8,";

	static class Child extends Sample8 {
		private String name = "Child,";

	}

	public static void main(String[] args) {

		Sample8 s = new Child();
		Child c = new Child();

		System.out.println(s.name); // prints Sample8, because from principles of polymophism we call member visile from
									// prespective of Sample8 class
		System.out.println(c.name);

	}

}
