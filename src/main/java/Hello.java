import org.apache.log4j.Logger;


public class Hello {
	private static Logger logger = Logger.getLogger(Hello.class);

	public static void main(String[] args) {
		System.out.println("Hello World !!");
		logger.info("HelloWorld !!");

	}
	
	public String sayHelloTo(String name) {
		return String.format("Hello, %s!", name);
	}

}
