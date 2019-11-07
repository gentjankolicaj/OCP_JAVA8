package ocp.java8.streams;

import java.util.stream.Stream;
import java.util.function.Predicate;

public class Sample3 {

	public static void main(String[] args) {
	
		Predicate<? super String> pred=s->s.length()>3;
		
		Stream<String> stream=Stream.iterate("-",s->s+s);
		
		boolean b1=stream.noneMatch(pred);
		boolean b2=stream.anyMatch(pred);
		
		System.out.println(b1+" "+b2);

	}

}
