package com.pan.tdd;

/**
 * @Description :
 * @Author :AlbertPan
 * @Date : 17/6/3
 */
public class SpecialNums {

	private Integer firstNum;
	private Integer secondNum;
	private Integer thirdNum;

	public SpecialNums(Integer firstNum, Integer secondNum, Integer thirdNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.thirdNum = thirdNum;
	}

	public Integer getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(Integer firstNum) {
		this.firstNum = firstNum;
	}

	public Integer getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(Integer secondNum) {
		this.secondNum = secondNum;
	}

	public Integer getThirdNum() {
		return thirdNum;
	}

	public void setThirdNum(Integer thirdNum) {
		this.thirdNum = thirdNum;
	}
}
