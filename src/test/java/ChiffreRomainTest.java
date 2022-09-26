package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.java.ChiffreRomain;

class ChiffreRomainTest {

	@Test
	void testFrequencyIIII() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = true;
		String[] stringArray = new String[] {"I","I","I","I"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isFrequency3(list);
		assertEquals(actual,expected);
	}

	@Test
	void testFrequencyVVV() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = true;
		String[] stringArray = new String[] {"V","V","V"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isFrequency3(list);
		assertEquals(actual,expected);
	}
	
	@Test
	void testFrequencyMMM() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = true;
		String[] stringArray = new String[] {"M","M","M"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isFrequency3(list);
		assertEquals(actual,expected);
	}
	
	@Test
	void testFrequencyM() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = false;
		String[] stringArray = new String[] {"M"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isFrequency3(list);
		assertEquals(actual,expected);
	}
	
	@Test
	void testFrequencyXX() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = false;
		String[] stringArray = new String[] {"X","X"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isFrequency3(list);
		assertEquals(actual,expected);
	}
	
	@Test
	void testFrequencyXXMXX() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = false;
		String[] stringArray = new String[] {"X","X","M","X","X"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isFrequency3(list);
		assertEquals(actual,expected);
	}
	
	@Test
	void testRomainXCD() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = true;
		String[] stringArray = new String[] {"X","C","D"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isRomain(list);
		assertEquals(actual,expected);
	}
	
	@Test
	void testRomainVIWZ() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = false;
		String[] stringArray = new String[] {"V","I","W","Z"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isRomain(list);
		assertEquals(actual,expected);
	}
	
	@Test
	void testValidIIII() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = false;
		String[] stringArray = new String[] {"I","I","I","I"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isValid(list);
		assertEquals(actual,expected);
	}
	
	@Test
	void testValidXVI() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		boolean expected = true;
		String[] stringArray = new String[] {"X","V","I"};
		ArrayList<String>  list = new ArrayList<>(Arrays.asList(stringArray));
		boolean actual = chifreRomain.isValid(list);
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersI() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 1;
		int actual = chifreRomain.convertToNumbers("I");
		assertEquals(actual,expected);		
	}
	
	@Test
	void testConvertToNumbersV() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 5;
		int actual = chifreRomain.convertToNumbers("V");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersX() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 10;
		int actual = chifreRomain.convertToNumbers("X");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersL() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 50;
		int actual = chifreRomain.convertToNumbers("L");
		assertEquals(actual,expected);
		
	}
	
	@Test
	void testConvertToNumbersC() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 100;
		int actual = chifreRomain.convertToNumbers("C");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersD() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 500;
		int actual = chifreRomain.convertToNumbers("D");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersM() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 1000;
		int actual = chifreRomain.convertToNumbers("M");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersMCDLIX() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 1459;
		int actual = chifreRomain.convertToNumbers("MCDLIX");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersDCCLIII() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 753;
		int actual = chifreRomain.convertToNumbers("DCCLIII");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersMXXX() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 1030;
		int actual = chifreRomain.convertToNumbers("MXXX");
		assertEquals(actual,expected);
	}
	

	@Test
	void testConvertToNumbersVV() {
		//in the case of a not valid format the function return Zero
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 0;
		int actual = chifreRomain.convertToNumbers("VV");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersAZI() {
		//in the case of a not valid format the function return Zero
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 0;
		int actual = chifreRomain.convertToNumbers("AZI");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersXXXIV() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 34;
		int actual = chifreRomain.convertToNumbers("XXXIV");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersDXLV() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 545;
		int actual = chifreRomain.convertToNumbers("DXLV");
		assertEquals(actual,expected);
	}
	
	
	@Test
	void testConvertToNumbersMMMM() {
		//in the case of a not valid format the function return Zero
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 0;
		int actual = chifreRomain.convertToNumbers("MMMM");
		assertEquals(actual,expected);
	}
	
	@Test
	void testConvertToNumbersIIII() {
		//in the case of a not valid format the function return Zero
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 0;
		int actual = chifreRomain.convertToNumbers("IIII");
		assertEquals(actual,expected);
	}
	
	
	@Test
	void testConvertToNumbersMCCXXXVIII() {
		ChiffreRomain chifreRomain = new ChiffreRomain();
		int expected = 1238;
		int actual = chifreRomain.convertToNumbers("MCCXXXVIII");
		assertEquals(actual,expected);
	}
}
