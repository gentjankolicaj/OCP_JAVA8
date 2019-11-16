package ocp.java8.concurrent;

import java.util.concurrent.Executors;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class Sample3 {
	
	static int counter=0;

	public static void main(String[] args) throws InterruptedException,ExecutionException{
		
		ExecutorService service=Executors.newSingleThreadExecutor();
		List<Future<?>> results=new ArrayList<>();
		
	//	IntStream.iterate(0, i->i+1).limit(5).forEach(i->results.add(service.execute(()->counter++)));
	// service.execute() returns void not future therefore we have compile error
		
		for(Future<?> var:results) {
			System.out.println(var.get());
		}
		
	}
}
