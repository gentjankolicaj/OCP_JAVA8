package ocp.java8.advance_class_design;

public class Sample5 {
	
	static class Browser{
		
		public void go() {
			System.out.println("Inside browser");
		}
	}
	
	
	static class Firefox extends Browser{
		
		public void go() {
			System.out.println("Inside firefox");
		}
	}
	
	static class IE extends Browser{
		
		public void go() {
			System.out.println("Inside IE");
		}
	}

	public static void main(String[] args) {
		
		Browser f=new Firefox();
		
		IE ie=(IE) f;
		
		ie.go();

	}

}
