package ocp.java8.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sample1 {

	public static void main(String[] args) {
		
		ExecutorService service=Executors.newSingleThreadExecutor();
		ScheduledExecutorService service2=Executors.newSingleThreadScheduledExecutor();
		
		ExecutorService service3=Executors.newCachedThreadPool();
		ExecutorService service4=Executors.newFixedThreadPool(10);
		ExecutorService service5=Executors.newScheduledThreadPool(10);
		
		service.execute(()->System.out.println("Hello from execute method"));
		Future<String> result=service.submit(()->"Hello from submit method");
		

		
		
		

	}

}
