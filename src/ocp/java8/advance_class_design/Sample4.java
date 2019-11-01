package ocp.java8.advance_class_design;

public class Sample4 {

	private int x = 24;

	public int getX() {
		String message = "x is ";

		class LocalInnerClass {
			private int x = Sample4.this.x;

			public void getX() {
				System.out.println(message + x);
			}
		}

		LocalInnerClass lic = new LocalInnerClass();
		lic.getX();

		return x;
	}

	public static void main(String[] args) {

		new Sample4().getX();

	}

}
