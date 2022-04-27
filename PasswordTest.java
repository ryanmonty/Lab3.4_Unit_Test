import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordTest {

	@Test
	void testExistRule1() {
		boolean expected = false;
		boolean actual = Password.validPassword("AMORE11");
		assertEquals(expected, actual);
	}
	@Test
	void testExistRule12() {
		boolean expected = true;
		boolean actual = Password.validPassword("NEWPASSWORD1");
		assertEquals(expected, actual);
	}
	@Test
	void testLengthRule1() {
		boolean expected = false;
		boolean actual = Password.validPassword("PASSWORDTOOLONG1");
		assertEquals(expected, actual);
	}
	@Test
	void testLengthRule2() {
		boolean expected = true;
		boolean actual = Password.validPassword("CORRECTSIZE1");
		assertEquals(expected, actual);
	}
	@Test
	void testNumberRule1() {
		boolean expected = true;
		boolean actual = Password.validPassword("PASSWORD1");
		assertEquals(expected, actual);
	}
	@Test
	void testNumberule2() {
		boolean expected = false;
		boolean actual = Password.validPassword("PASSWORD6");
		assertEquals(expected, actual);
	}
	@Test
	void testNoSpacesRule1() {
		boolean expected = false;
		boolean actual = Password.validPassword("PASSWORD 12");
		assertEquals(expected, actual);
	}
	@Test
	void testNoSpaceRule2() {
		boolean expected = false;
		boolean actual = Password.validPassword(" PASSWORD12");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalVowelRule1() {
		boolean expected = false;
		boolean actual = Password.validPassword("passwOrd1");
		assertEquals(expected, actual);
	}
	@Test
	void testCapitalVowelRule2() {
		boolean expected = false;
		boolean actual = Password.validPassword("password1");
		assertEquals(expected, actual);
	}
	@Test
	void testAdminRule() {
		boolean expected = false;
		boolean actual = Password.validPassword("admin");
		assertEquals(expected, actual);
	}
	@Test
	void testModRule() {
		boolean expected = true;
		boolean actual = Password.validPassword("mod");
		assertEquals(expected, actual);
	}
	

}
