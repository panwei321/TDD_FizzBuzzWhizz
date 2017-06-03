package com.pan.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @Description :
 * @Author :AlbertPan
 * @Date : 17/6/3
 */
public class NumberSounderTest {
	private SpecialNum specialNum;
	private NumberSounder numberSounder;

	@Before
	public void setUp() throws Exception {
		specialNum = new SpecialNum(3, 5, 7);
		numberSounder = new NumberSounder(specialNum);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_return_Fizz_when_input_contain_first_special_num() {
		// given

		Integer inputNum = 13;

		// when
		String outputNum = numberSounder.getNumber(inputNum);

		// then
		assertThat(outputNum, is("Fizz"));
	}

	@Test
	public void should_return_FizzBuzzWhizz_when_input_is_multiple_of_all_specialNum() {
		// given
		Integer inputNum = 105;
		// when
		String outputNum = numberSounder.getNumber(inputNum);

		// then
		assertThat(outputNum, is("FizzBuzzWhizz"));
	}


	@Test
	public void should_return_FizzBuzz_when_input_is_multiple_of_firstSpecialNum_and_secondSpecialNum() {
		// given
		Integer inputNum = 15;

		// when
		String outputNum = numberSounder.getNumber(inputNum);

		// then
		assertThat(outputNum, is("FizzBuzz"));
	}
}