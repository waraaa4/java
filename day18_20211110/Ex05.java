package day18_20211110;

public class Ex05 {

	public static void main(String[] args) {
		MaxMinInst mm1 = new MaxMinInst();
		MaxMinInst mm2 = new MaxMinInst();
		MaxMinInst mm3 = new MaxMinInst();
		mm1.setMax(2); mm1.setMin(1);
		mm2.setMax(3); mm1.setMin(2);
		mm3.setMax(4); mm1.setMin(3);
		
		MaxMinInst[] arr=new MaxMinInst[3];
		arr[0] = mm1;
		arr[1] = mm2;
		arr[2] = mm3;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("max= "+arr[i].getMax());
		}
		
		String[] names = new String[3];
		names[0] = "kim";
		names[1] = "park";
		names[2] = "cha";
		
		for(String s: names) {
			System.out.println(s);
		}
	}

}
