package com.pan.tdd;

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

		return inputNum.toString();
	}

	private boolean isContainsFirstSpecNum(Integer inputNum, Integer firstSpecNum) {
		return String.valueOf(inputNum).contains(firstSpecNum.toString());
	}
}
