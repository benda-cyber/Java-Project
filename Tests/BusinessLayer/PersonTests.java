package BusinessLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTests {

	Person person1;
	Object obj1;
	
	@Before
	public void setUp() {
		System.out.println("SetUp");
		person1 = new Person();
		obj1 = new Object();
	}
	
	
	@Test
	public void hashCodeTestWithNoId() {
    //System.out.println("hashCodeTest");
		int result;
		result = person1.hashCode();
		System.out.println(result);
		assertEquals(31, result);
	}
	
	@Test
	public void hashCodeTestWithId() {
    //System.out.println("hashCodeTest");
		int result;
		person1.setId("David");
		result = person1.hashCode();
		assertEquals(65805939, result);
	}
	
	@Test
	public void equalsTestReturnsFalse() {
    //System.out.println("equalsTest");
    boolean result;
		result = person1.equals(obj1);
		assertFalse(result);
	}
	
	@Test
	public void equalsTestReturnsTrue() {
    //System.out.println("equalsTest");
    boolean result;
   // person1=(Person)obj1;
    obj1 = new Person();
		result = person1.equals(obj1);
		assertTrue(result);
	}
	
	@Test
	public void equalsTestIdIsNullReturnsFalse() {
    //System.out.println("equalsTest");
    boolean result;
    obj1 = new Person();
    ((Person) obj1).setId(null);
    person1.setId("id");
		result = person1.equals(obj1);
		assertFalse(result);
	}
	@Test
	public void equalsTestIdIsNullReturnsTrue() {
    //System.out.println("equalsTest");
    boolean result;
    obj1 = new Person();
    ((Person) obj1).setId(null);
    
		result = person1.equals(obj1);
		assertTrue(result);
	}

}
