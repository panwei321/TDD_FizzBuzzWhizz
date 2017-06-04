package com.pan.tdd;

import org.apache.commons.lang.StringUtils;

/**
 * @Description :学生类
 * @Author :AlbertPan
 * @Date : 17/6/4
 */
public class Student {

	private SpecialNum specialNum;

	public Student(SpecialNum specialNum) {
		this.specialNum = specialNum;
	}


	public String numberOff(Integer originalNum) {
		String rightSound= getRightSound(originalNum);
		System.out.println(rightSound);
		return  rightSound;
	}

	private String getRightSound(Integer originalNum) {
		String rightSound;
		rightSound = getRightSoundWhenContainsFirstSpecialNum(originalNum);
		if (StringUtils.isNotBlank(rightSound)) {
			return rightSound;
		}

		rightSound = getRightSoundWhenIsMultipleOfSpecialNum(originalNum);

		if (StringUtils.isNotBlank(rightSound)) {
			return rightSound;
		}
		return String.valueOf(originalNum);
	}


	private String getRightSoundWhenIsMultipleOfSpecialNum(Integer originalNum) {
		StringBuilder rightSound = new StringBuilder();
		rightSound.append(getRightSoundWhenIsMultipleOfFirstSpecialNum(originalNum));
		rightSound.append(getRightSoundWhenIsMultipleOfSecondSpecialNum(originalNum));
		rightSound.append(getRightSoundWhenIsMultipleOfThirdSpecialNum(originalNum));
		return rightSound.toString();
	}

	private String getRightSoundWhenIsMultipleOfFirstSpecialNum(Integer originalNum) {
		if (isMultiple(originalNum, specialNum.getFirstNum())) {
			return SpecialNumType.FIRST.getValue();
		}
		return "";
	}

	private String getRightSoundWhenIsMultipleOfSecondSpecialNum(Integer originalNum) {
		if (isMultiple(originalNum, specialNum.getSecondNum())) {
			return  SpecialNumType.SECOND.getValue();
		}
		return "";
	}

	private String getRightSoundWhenIsMultipleOfThirdSpecialNum(Integer originalNum) {
		if (isMultiple(originalNum, specialNum.getThirdNum())) {
			return SpecialNumType.THIRD.getValue();
		}
		return "";
	}





	private boolean isMultiple(Integer originalNum, Integer specNum) {
		return originalNum % specNum == 0;
	}

	private String getRightSoundWhenContainsFirstSpecialNum(Integer originalNum) {
		if (isContainsFirstSpecNum(originalNum, specialNum.getFirstNum())) {
			return SpecialNumType.FIRST.getValue();
		}
		return null;
	}

	private boolean isContainsFirstSpecNum(Integer originalNum, Integer firstSpecNum) {
		return String.valueOf(originalNum).contains(firstSpecNum.toString());
	}
}
