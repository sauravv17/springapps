package com.springdemos.springcore.reftypes;

public class Scores {

	private double math;
	private double english;
	private double hindi;

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getHindi() {
		return hindi;
	}

	public void setHindi(double hindi) {
		this.hindi = hindi;
	}

	@Override
	public String toString() {
		return "Scores [math=" + math + ", english=" + english + ", hindi=" + hindi + "]";
	}

}
