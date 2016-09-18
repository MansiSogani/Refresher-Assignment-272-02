import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;
public class TestQueueImplementation {
	@Test
	public void test() {
		DemoQueueImplementation queue = new DemoQueueImplementation();
	int actual = queue.queue1();
	// Testing for token number 3
		assertEquals(10, actual);
	}
}