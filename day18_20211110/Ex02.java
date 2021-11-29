package day18_20211110;

public class Ex02 {

	public static void main(String[] args) {
		int num=1;
		boolean search=false;
		
		while(num<1000){
			if(num%35==0&&num%8==0) {
				search=true;
				break;
			}
			num++;
		}
		if(search) {
			System.out.println("찾은 정수: "+ num);
		} else {
			System.out.println("35배수이면서 8배수는 없어요");
		}

	}

}
