package com.pan.tdd;

import org.apache.commons.lang.StringUtils;

/**
 * @Description :
 * @Author :AlbertPan
 * @Date : 17/6/4
 */
public class Student {
	private SpecialNum specialNum;

	public Student(SpecialNum specialNum) {
		this.specialNum = specialNum;
	}


	public String numberOff(Integer originalNum) {

		StringBuilder rightSound = new StringBuilder();

		if (originalNum % specialNum.getFirstNum() == 0) {
			rightSound.append(SpecialNumType.getValue(SpecialNumType.FIRST.getKey()));
		}

		if (originalNum % specialNum.getSecondNum() == 0) {
			rightSound.append(SpecialNumType.getValue(SpecialNumType.SECOND.getKey()));
		}

		if (originalNum % specialNum.getThirdNum() == 0) {
			rightSound.append(SpecialNumType.getValue(SpecialNumType.THIRD.getKey()));
		}


		if (StringUtils.isNotBlank(rightSound.toString())) {
			return rightSound.toString();
		}

		return String.valueOf(originalNum);
	}
}
