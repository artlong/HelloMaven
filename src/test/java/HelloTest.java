import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloTest {
	private static Logger logger = Logger.getLogger(HelloTest.class);
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		logger.info("HelloTest!!");
	}

	@Test
	public void sayHelloTo() {
		String name = "Longan";
		Hello ho = new Hello();
		assertEquals("Hello, Longan!", ho.sayHelloTo(name));
	}
}
