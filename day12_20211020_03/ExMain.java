package day12_20211020_03;

import java.util.*;

public class ExMain {

	public static void main(String[] args) {
		Ex ex1 = new Ex();
		Scanner scan = new Scanner(System.in);
		List<Ex> exList = new ArrayList<Ex>();
		
		ex1.setName("이름1");
		ex1.setAge(21);
		ex1.setStudentNumber("asd1");
		
		Ex ex2 = new Ex("이름2", 22, "asd2");
		
		exList.add(ex1);
		exList.add(ex2);
		
		System.out.println(exList.get(0).getName()); 
		
		for(int i = 0; i < exList.size(); i++) {
			System.out.println(exList.get(i).getName());
		}

	}

}
