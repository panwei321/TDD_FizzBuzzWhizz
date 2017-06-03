package com.pan.tdd;

import org.apache.commons.lang.StringUtils;

/**
 * @Description :报数处理类
 * @Author :AlbertPan
 * @Date : 17/6/3
 */
public class NumberSounder {

	private SpecialNum specialNum;

	public NumberSounder(SpecialNum specialNum) {
		this.specialNum = specialNum;
	}

	public String getNumber(Integer inputNum) {

		if (isContainsFirstSpecNum(inputNum, specialNum.getFirstNum())){
			return SpecNumType.FIRST.value;
		}

		StringBuilder result=new StringBuilder();
		if (isMultiple(inputNum, specialNum.getFirstNum())){
			result.append(SpecNumType.FIRST.value);
		}
		if (isMultiple(inputNum, specialNum.getSecondNum())){
			result.append(SpecNumType.SECOND.value);
		}
		if (isMultiple(inputNum, specialNum.getThirdNum())){
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
