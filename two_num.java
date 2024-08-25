package railway_reservation_system;

import java.util.*;
public class two_num {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner an = new Scanner(System.in);
		
		String str = an.next();
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(') {
				count++;
			}else if(ch == ')'){
				count--;
			}
		}
		if(count != 0 ) {
	     System.out.println("False"+count);
		}else {
			System.out.println("True");
		}

	}

}
