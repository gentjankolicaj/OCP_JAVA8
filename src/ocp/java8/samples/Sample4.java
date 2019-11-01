package ocp.java8.samples;

public class Sample4 <T>{
	
	T t;
	

	public Sample4(T t) {
		super();
		this.t = t;
	}


	@Override
	public String toString() {
		return t.toString();
	}


	public static void main(String[] args) {
		System.out.println(new Sample4<String>("Hi"));
		System.out.println(new Sample4("Hi"));

	}

}
