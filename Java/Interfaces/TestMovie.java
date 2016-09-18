import static org.junit.Assert.*;

import org.junit.Test;
public class TestMovie {
	@Test
	public void test() {
		Movie m = new MovieClass();
		String expected = m.AntMan();
		String actual = "You are watching Antman";
		assertEquals(expected, actual);
	}
}