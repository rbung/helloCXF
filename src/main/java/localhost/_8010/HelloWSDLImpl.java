package localhost._8010;

public class HelloWSDLImpl implements HelloWSDL{

	public String sayHello(String text) {
		// TODO Auto-generated method stub
		System.out.println("sayHello called");
		return "Hello "+text;
	}

}
