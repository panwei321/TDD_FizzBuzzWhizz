package com.pan.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @Description :
 * @Author :AlbertPan
 * @Date : 17/6/4
 */
public class StudentTest {

	private Student student;
	private SpecialNum specialNum;

	@Before
	public void setUp() throws Exception {
		specialNum = new SpecialNum(3, 5, 7);
		student = new Student(specialNum);
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void should_return_Buzz_when_input_is_multiple_of_secondSpecialNum() {
		// given
		Integer originalNum = specialNum.getSecondNum() * 2;

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("Buzz"));

	}

	@Test
	public void should_return_FizzBuzzWhizz_when_input_is_multiple_of_all_specialNum() {
		// given
		Integer originalNum = specialNum.getFirstNum() * specialNum.getSecondNum() * specialNum.getThirdNum();

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("FizzBuzzWhizz"));

	}

	@Test
	public void should_return_FizzBuzz_when_input_is_multiple_of_firstSpecialNum_and_secondSpecialNum() {
		// given
		Integer originalNum = specialNum.getFirstNum() * specialNum.getSecondNum() ;

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("FizzBuzz"));
	}
}