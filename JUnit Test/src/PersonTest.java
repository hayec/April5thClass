import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testGetName() 
	{
		Person p1 = new Person("John", 1);
		String name = p1.getName();
		assertEquals("John", name);
	}

}
