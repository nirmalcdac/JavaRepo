public class PracticeThreadDeadlock implements Runnable {
	A a = new A();
	B b = new B();

	PracticeThreadDeadlock() {
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "RacingThread");
		t.start();
		a.foo(b);
		System.out.println("Back into the main Thread");
	}

	public void run() {
		b.bar(a);
		System.out.println("Back in other thread");
	}

	public static void main(String Args[]) {
		new PracticeThreadDeadlock();
	}
}

class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + "Entered A.foo");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("A interrupted");
		}
		System.out.println(name + "Trying to call B.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("Inside A.last");
	}
}

class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + "Entered B.bar");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("A interrupted");
		}
		System.out.println(name + "Trying to call A.last()");
		a.last();
	}

	synchronized void last() {
		System.out.println("Inside A.last");
	}
}
