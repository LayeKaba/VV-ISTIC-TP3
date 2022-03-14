package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

  Date date1;
	Date date3;
	Date date2;
	Date date5;
	Date date4;
	
	@BeforeEach
	void setUp ()
	{
		 date1 = new Date(32,13, 2);
		 date2 = new Date(31, 12, 2020);
		 date3 = new Date(14, 3, 2022);
		 date4 = new Date(32, 1, 2004);
		 date5 = new Date(01, 1, 2000);
		
	}
	
	@Test
	void test1()
	{
		assertTrue(Date.isLeapYear(date4.getYear()));
		assertFalse(Date.isLeapYear(date1.getYear()));
	}
	
	@Test
	void test2()
	{
		assertTrue(Date.isValidDate(date5.getDay(), date5.getMonth(), date5.getYear()));
		assertFalse(Date.isValidDate(date1.getDay(), date1.getMonth(), date1.getYear()));
	}
	@Test
	void test3()
	{
		assertEquals(date5, date5.nextDate().previousDate());
		
	}
	@Test
	void test4()
	{
		assertEquals(0, date5.compareTo( date5.nextDate().previousDate()));
	}
	
	@Test
	void test5()
	{
		assertEquals(0, date5.nextDate().compareTo(new Date(02, 1, 2000)));
		
	}
	@Test
	void test6()
	{
		assertNotEquals(new Date(01, 1, 2000), date5.nextDate());
	}
	@Test
	void test7()
	{
		
	}

}
