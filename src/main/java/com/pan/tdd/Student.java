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
		String rightSound = getRightSound(originalNum);
		System.out.println(rightSound);
		return rightSound;
	}

	private String getRightSound(Integer originalNum) {
		String codeName;

		codeName = getCodeNameWhenIsMultipleOfSpecialNum(originalNum);

		if (isContainsFirstSpecNum(originalNum, specialNum.getFirstNum())) {
			codeName = SpecialNumType.FIRST.getValue();
		}
		
		if (StringUtils.isBlank(codeName)) {
			codeName = String.valueOf(originalNum);
		}
		return codeName;
	}


	private String getCodeNameWhenIsMultipleOfSpecialNum(Integer originalNum) {
		StringBuilder rightSound = new StringBuilder();
		rightSound.append(getCodeNameWhenIsMultipleOfFirstSpecialNum(originalNum));
		rightSound.append(getCodeNameWhenIsMultipleOfSecondSpecialNum(originalNum));
		rightSound.append(getCodeNameWhenIsMultipleOfThirdSpecialNum(originalNum));
		return rightSound.toString();
	}

	private String getCodeNameWhenIsMultipleOfFirstSpecialNum(Integer originalNum) {
		if (isMultiple(originalNum, specialNum.getFirstNum())) {
			return SpecialNumType.FIRST.getValue();
		}
		return "";
	}

	private String getCodeNameWhenIsMultipleOfSecondSpecialNum(Integer originalNum) {
		if (isMultiple(originalNum, specialNum.getSecondNum())) {
			return SpecialNumType.SECOND.getValue();
		}
		return "";
	}

	private String getCodeNameWhenIsMultipleOfThirdSpecialNum(Integer originalNum) {
		if (isMultiple(originalNum, specialNum.getThirdNum())) {
			return SpecialNumType.THIRD.getValue();
		}
		return "";
	}


	private boolean isMultiple(Integer originalNum, Integer specNum) {
		return originalNum % specNum == 0;
	}


	private String getCodeNameWhenContainsFirstSpecialNum(Integer originalNum) {
		if (isContainsFirstSpecNum(originalNum, specialNum.getFirstNum())) {
			return SpecialNumType.FIRST.getValue();
		}
		return null;
	}

	private boolean isContainsFirstSpecNum(Integer originalNum, Integer firstSpecNum) {
		return String.valueOf(originalNum).contains(firstSpecNum.toString());
	}
}
