import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class ServerGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("서버 모듈 생성 START !!!!!");
		WSDLToJava.main(new String[] { "-server", "-d", "src/main/java",
				"src/main/resources/helloWSDL.wsdl" });
		System.out.println("서버 모듈 생성 END   !!!!!");
	}

}
