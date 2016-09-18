 import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
public class TestGenerics {
	List<String> actual = new ArrayList<String>();
	@Test
	public void test() {
		GenericsDemoCars gen = new GenericsDemoCars();
		actual = gen.Cars();
		int expected = 4;
		assertEquals(expected, actual.size());
	}
}