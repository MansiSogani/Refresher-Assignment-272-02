import static org.junit.Assert.*;

import org.junit.Test;


public class TestMultiThreading {
	MultiThreadingDemo multi = new MultiThreadingDemo();
	
	@Test
	public void test() {
		String expected = multi.user();
		String actual = "Mansi";
		assertEquals(expected, actual);
	}

}