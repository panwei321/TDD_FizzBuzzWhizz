package com.pan.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @Description :
 * @Author :AlbertPan
 * @Date : 17/6/3
 */
public class NumberSounderTest {
	private SpecialNums specialNums;
	private NumberSounder numberSounder;

	@Before
	public void setUp() throws Exception {
		specialNums = new SpecialNums(3, 5, 7);
		numberSounder = new NumberSounder(specialNums);
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
	public void should_return_FizzBuzzWhizz_when_input_is_multiple_of_all_specNum() {
		// given
		Integer inputNum = 105;
		// when
		String outputNum = numberSounder.getNumber(inputNum);

		// then
		assertThat(outputNum, is("FizzBuzzWhizz"));
	}
}