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

		StringBuilder rightSound = new StringBuilder();

		getRightSoundWhenisMultipleOfSpecialNum(originalNum, rightSound);


		if (StringUtils.isNotBlank(rightSound.toString())) {
			return rightSound.toString();
		}

		return String.valueOf(originalNum);
	}


	private void getRightSoundWhenisMultipleOfSpecialNum(Integer originalNum, StringBuilder rightSound) {
		getRightSoundWhenisMultipleOfFirstSpecialNum(originalNum, rightSound);
		getRightSoundWhenisMultipleOfSecondSpecialNum(originalNum, rightSound);
		getRightSoundWhenisMultipleOfThirdSpecialNum(originalNum, rightSound);
	}


	private void getRightSoundWhenisMultipleOfThirdSpecialNum(Integer originalNum, StringBuilder rightSound) {
		if (isMultiple(originalNum, specialNum.getThirdNum())) {
			rightSound.append(SpecialNumType.THIRD.getValue());
		}
	}

	private void getRightSoundWhenisMultipleOfSecondSpecialNum(Integer originalNum, StringBuilder rightSound) {
		if (isMultiple(originalNum, specialNum.getSecondNum())) {
			rightSound.append(SpecialNumType.SECOND.getValue());
		}
	}

	private void getRightSoundWhenisMultipleOfFirstSpecialNum(Integer originalNum, StringBuilder rightSound) {
		if (isMultiple(originalNum, specialNum.getFirstNum())) {
			rightSound.append(SpecialNumType.FIRST.getValue());
		}
	}

	private boolean isMultiple(Integer originalNum, Integer specNum) {
		return originalNum % specNum == 0;
	}

	private boolean isContainsFirstSpecNum(Integer originalNum, Integer firstSpecNum) {
		return String.valueOf(originalNum).contains(firstSpecNum.toString());
	}
}
