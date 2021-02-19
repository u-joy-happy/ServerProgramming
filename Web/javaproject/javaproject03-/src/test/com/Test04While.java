package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04While {
	public static void main(String[] args) throws IOException {
		System.out.println("loof - while");
		System.out.println();
		
		boolean bool = true;
		int i = 0;
		while(bool) {
			System.out.println("while running");
			bool = !bool;
			i++;
		}
		System.out.println();
		
		int count = 0;
		while(count < 3) {
			System.out.println(count);
			count++;
		}
		System.out.println();
		
		boolean con = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(con) {
			System.out.println("Hello, (종료는 x 입력)");
			String txt = br.readLine();
			if(txt.equals("x")) {
				System.out.println("END");
				break;
			}
		}
		
	}
}






