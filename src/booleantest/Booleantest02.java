// 1부터 10까지 출력되도록 코드를 수정해봅시다.

package booleantest;

public class Booleantest02 {

	public static void main(String[] args) {

		boolean flag = true;
		int i = 1;
		
	
		while(flag) {
			
			System.out.println(i);
			i = ++i;     // i = i + 1;도 가능함. 근데 왜 i++;를 넣으면 원하는 값이 안나올까?
		
			
			if(i == 11) {
				flag = false;
			}
		}
	}

}
