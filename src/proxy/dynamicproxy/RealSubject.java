package proxy.dynamicproxy;

public class RealSubject implements Subject {

	public void request() {
		System.out.println("RealSubject request method ...");
	}
}