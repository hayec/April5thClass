import static org.junit.Assert.*;
import org.junit.Test;
//import static org.hamcrest.number.isCloseTo.*;
public class BodyBagTest 
{
	@Test
	public void testBodyBag()
	{
		BodyBag bb = new BodyBag(10);
		Person p1 = new Person("John", 1);
		Person p2 = new Person("Jane", 2);
		bb.add(p1);
		bb.add(p2);
		Person expected = new Person("Jane", 1);
		Person actual = bb.findById(1);
		assertEquals(actual.getName(), expected.getName());
		assertEquals(actual.getId(), expected.getId());
		Person expected2= new Person("Jane", 2);
		//assetEquals(double1, double2, epsilon as ".00001")
	}
}
