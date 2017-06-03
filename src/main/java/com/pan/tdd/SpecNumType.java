package com.pan.tdd;

/**
 * @Description :
 * @Author :AlbertPan
 * @Date : 17/6/3
 */
public enum SpecNumType {

	FIRST("Fizz"),
	SECOND("Buzz"),
	THIRD("Whizz");

	String value;


	SpecNumType(String value) {
		this.value = value;
	}

}
