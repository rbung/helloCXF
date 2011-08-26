package demo.spring;

public class HelloWorldImpl implements HelloWorld{

	public String sayHello(String text) {
		// TODO Auto-generated method stub
		System.out.println("sayHello called");
		return "Hello "+text;
	}

}
