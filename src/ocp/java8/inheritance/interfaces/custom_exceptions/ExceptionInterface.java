package ocp.java8.inheritance.interfaces.custom_exceptions;

import ocp.java8.inheritance.interfaces.custom_exceptions.CheckedException;
import ocp.java8.inheritance.interfaces.custom_exceptions.UncheckedException;

public abstract interface ExceptionInterface {
	
	public abstract void test1();
	
	public abstract void test2() throws Exception;
	
	public abstract void test3() throws RuntimeException;
	
	public abstract void test4() throws Error;
	
	public abstract void test5() throws Throwable;
	
	public abstract void test6() throws Exception,RuntimeException;
	
	public abstract void test7() throws CheckedException,UncheckedException;

}
