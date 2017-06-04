package com.pan.tdd;

/**
 * @Description : 特殊数与对应的字符
 * @Author :AlbertPan
 * @Date : 17/6/4
 */
public enum SpecialNumType {

	FIRST(1,"Fizz"),
	SECOND(2,"Buzz"),
	THIRD(3,"Whizz");

    private  Integer key;
	private  String value;


	SpecialNumType(Integer key,String value) {
		this.key = key;
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static SpecialNumType getType(Integer key) {
		for (SpecialNumType type : values()) {
			if (type.key == key) {
				return type;
			}
		}
		throw new IllegalArgumentException("No matching constant for [" + key + "]");
	}

	public static String getValue(Integer key) {
		for (SpecialNumType type : values()) {
			if (type.key == key) {
				return type.value;
			}
		}
		throw new IllegalArgumentException("No matching constant for [" + key + "]");
	}
}
