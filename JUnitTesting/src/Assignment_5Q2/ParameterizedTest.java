package Assignment_5Q2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParameterizedTest {

	@Test
	public void test() {
		Parameterized obj=new Parameterized("Anu","Student",2003);
		obj.getName();
		obj.getAbout();
		obj.getBirthYear();
	}

}
