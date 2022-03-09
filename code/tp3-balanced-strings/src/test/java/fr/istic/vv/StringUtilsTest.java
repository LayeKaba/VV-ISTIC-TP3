package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static fr.istic.vv.StringUtils.isBalanced;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

  @Test
	public void testCorrectSimple(){
		String test01 = "{[][]}({})";
		String test02 = "{}";
		String test03 = "()";
		String test04 = "[]";
		String test05 = "{[()]}";

		assertEquals(true, Balance.isBalanced(test01));
		assertEquals(true, Balance.isBalanced(test02));
		assertEquals(true, Balance.isBalanced(test03));
		assertEquals(true, Balance.isBalanced(test04));
		assertEquals(true, Balance.isBalanced(test05));
	}

	@Test
	public void testIncorrect(){
		String test01 = "][";
		String test02 = "([)]";
		String test03 = "{";
		String test04 = "{(}{}";

		assertEquals(false, Balance.isBalanced(test01));
		assertEquals(false, Balance.isBalanced(test02));
		assertEquals(false, Balance.isBalanced(test03));
		assertEquals(false, Balance.isBalanced(test04));
	}

	@Test
	public void testComplex(){
		String test01 = "{[][aaa]}({bbb})";
		String test02 = "";
		String test03 = "abc";
		assertEquals(true, Balance.isBalanced(test01));
		assertEquals(true, Balance.isBalanced(test02));
		assertEquals(true, Balance.isBalanced(test03));

	}

}
