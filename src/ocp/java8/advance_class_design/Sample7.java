package ocp.java8.advance_class_design;

public class Sample7 {
	
	class Inner{
		
	}

	public static void main(String[] args) {
		
		// Inner in1=new Inner(); compile error
		
		// Inner in2=Sample7.new Inner(); compile error
		
	    // Sample7.Inner in3=new Sample7.Inner(); compile error
	    
	    //   Sample7.Inner in4=new Sample7().Inner(); compile error
	    
	    
	    Sample7.Inner in5=new Sample7().new Inner();
	    
	  // Sample7.Inner in6=Sample7.new Inner();  compile error
	    
	    //IMPORTANT NOTE :
	    //We can't create instances of member inner class if we don't have and instance of the outer class created first
	    //Then we use reference of the outer class to create instanceo of inner class
	    
	}

}
