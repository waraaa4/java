package day18_20211110;

public class MaxMinInst {

	private int max; // 0~100사이 정보은닉
	private int min; // 0~100사이

	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		if(max<0 || max>100)
			return;
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if(min<0 || min>100)
			return;
		this.min = min;
	}
	
	
	
}
