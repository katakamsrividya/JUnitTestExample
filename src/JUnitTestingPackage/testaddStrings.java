package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		junitfunction junitString=new junitfunction();
		String result=junitString.addStrings("sri","vidya");
		assertEquals("srividya",result);
	}

}
