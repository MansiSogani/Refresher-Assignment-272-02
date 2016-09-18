import static org.junit.Assert.*;
import java.util.TreeSet;
import org.junit.Test;
public class TreeSetTest {
	@Test
	public void test() {
		TreeSet<String> actual = new TreeSet<String>();
		CollectionTreeSetDemo ct = new CollectionTreeSetDemo();
		actual = ct.TreeSet();
		TreeSet<String> expected=new TreeSet<String>();
		expected.add("ABC123");
		expected.add("ABC456");
		expected.add("ABC789");
		assertEquals(expected, actual);
	}
}