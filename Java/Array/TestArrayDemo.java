import static org.junit.Assert.*;

import org.junit.Test;
public class TestArrayDemo {
	public String StudentName[];
	String name = "Akash";
	ArrayDemo ad = new ArrayDemo();	
	@Test
	public void test() {
		StudentName = ad.studentArray();
		assertEquals(name, StudentName[1]);
	}
}