package ocp.java8.advanced_fi;

public class Sample2 {

	public static void main(String[] args) {
		// Multiple lambda calls
		// and nested lambdas
		
		A a=(b)->{};
		a.use(c->{});

	}

	static interface A {

		void use(B b);
	}

	static interface B {

		void use(C c);
	}

	static interface C {

		void use(D d);
	}

	static interface D {

	}

}
