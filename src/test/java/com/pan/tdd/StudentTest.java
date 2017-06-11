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
	public void should_return_Fizz_when_input_is_multiple_of_firstSpecialNum() {
		// given
		Integer originalNum = specialNum.getFirstNum() * 2;

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("Fizz"));

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
	public void should_return_Whizz_when_input_is_multiple_of_thirdSpecialNum() {
		// given
		Integer originalNum = specialNum.getThirdNum() * 2;

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("Whizz"));

	}

	@Test
	public void should_return_FizzBuzz_when_input_is_multiple_of_firstSpecialNum_and_secondSpecialNum() {
		// given
		Integer originalNum = specialNum.getFirstNum() * specialNum.getSecondNum();

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("FizzBuzz"));
	}

	@Test
	public void should_return_FizzWhizz_when_input_is_multiple_of_firstSpecialNum_and_thirdSpecialNum() {
		// given
		Integer originalNum = specialNum.getFirstNum() * specialNum.getThirdNum();

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("FizzWhizz"));
	}

	@Test
	public void should_return_BuzzWhizz_when_input_is_multiple_of_secondSpecialNum_and_thirdSpecialNum() {
		// given
		Integer originalNum = specialNum.getSecondNum() * specialNum.getThirdNum() * 2;

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("BuzzWhizz"));
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
	public void should_return_Fizz_when_input_contain_first_special_num() {
		// given
		Integer originalNum = Integer.parseInt("5" + specialNum.getFirstNum());

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("Fizz"));
	}

	@Test
	public void should_return_4_when_input_4() {
		// given
		Integer originalNum = 4;

		// when
		String rightNum = student.numberOff(originalNum);

		// then
		assertThat(rightNum, is("4"));
	}


	@Test(expected = ValidNumberExcetion.class)
	public void should_raise_exception_when_input_number_less_then_1() {
		// given
		Integer originalNum = 0;
		// when
		String rightNum = student.numberOff(originalNum);
		// then

	}
}