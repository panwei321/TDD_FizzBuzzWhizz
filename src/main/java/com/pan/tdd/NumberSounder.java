package com.pan.tdd;

import org.apache.commons.lang.StringUtils;

/**
 * @Description :
 * @Author :AlbertPan
 * @Date : 17/6/3
 */
public class NumberSounder {

	private  SpecialNums specialNums;

	public NumberSounder(SpecialNums specialNums) {
		this.specialNums = specialNums;
	}

	public String getNumber(Integer inputNum) {

		if (isContainsFirstSpecNum(inputNum, specialNums.getFirstNum())){
			return SpecNumType.FIRST.value;
		}

		StringBuilder result=new StringBuilder();
		if (isMultiple(inputNum,specialNums.getFirstNum())){
			result.append(SpecNumType.FIRST.value);
		}
		if (isMultiple(inputNum,specialNums.getSecondNum())){
			result.append(SpecNumType.SECOND.value);
		}
		if (isMultiple(inputNum,specialNums.getThirdNum())){
			result.append(SpecNumType.THIRD.value);
		}

		if (StringUtils.isNotBlank(result.toString()) ){
			return  result.toString();
		}


		return inputNum.toString();
	}

	private boolean isMultiple(Integer inputNum,Integer specNum) {
		return inputNum%specNum==0;
	}

	private boolean isContainsFirstSpecNum(Integer inputNum, Integer firstSpecNum) {
		return String.valueOf(inputNum).contains(firstSpecNum.toString());
	}
}
