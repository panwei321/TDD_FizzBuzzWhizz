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

		if (inputNum%specialNums.getFirstNum()==0&&inputNum%specialNums.getSecondNum()==0&&inputNum%specialNums.getThirdNum()==0){
            return  SpecNumType.FIRST.value+SpecNumType.SECOND.value+SpecNumType.THIRD.value;
		}

		StringBuilder result=new StringBuilder();
		if (inputNum%specialNums.getFirstNum()==0){
			result.append(SpecNumType.FIRST.value);
		}
		if (inputNum%specialNums.getSecondNum()==0){
			result.append(SpecNumType.SECOND.value);
		}
		if (inputNum%specialNums.getThirdNum()==0){
			result.append(SpecNumType.THIRD.value);
		}
		if (StringUtils.isNotBlank(result.toString()) ){
			return  result.toString();
		}


		return inputNum.toString();
	}

	private boolean isContainsFirstSpecNum(Integer inputNum, Integer firstSpecNum) {
		return String.valueOf(inputNum).contains(firstSpecNum.toString());
	}
}
