package com.pan.tdd;

/**
 * @Description :
 * @Author :AlbertPan
 * @Date : 17/6/3
 */
public enum SpecialNumType {

	FIRST("Fizz"),
	SECOND("Buzz"),
	THIRD("Whizz");

	String value;


	SpecialNumType(String value) {
		this.value = value;
	}

}
