import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;
public class StackTest {
	Stack<String> actual = new Stack();
	@Test
	public void test() {
		StackDemo sd = new StackDemo();
		actual = sd.stackInsert();
		String expected = "Black";
		assertEquals(expected, actual.peek());
	}

}