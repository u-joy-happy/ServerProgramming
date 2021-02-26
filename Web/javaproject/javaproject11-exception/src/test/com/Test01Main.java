package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("exception");
		System.out.println();

//		testNullPointer();
//		testArrayIndex();
//		byZero();
//		numberFormat();
//		testReadLine();
		multiException();
		
		System.out.println("hi");

	} // end main

	private static void multiException() {
		try {

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");

		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		
		} catch (Exception e){
			System.out.println("Exception");
		
		} finally {
//			dismiss() / disconnect() / close()
		}
		
	}

	private static void testReadLine() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			// NullPointerException 발생 경우를 대비하여 try-catch로 감싸줌
			is = System.in;
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr); 
			
//			BufferedReader br2= new BufferedReader(new InputStreamReader(System.in));
			

			br.readLine(); // IOException
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	private static void numberFormat() {

		try {
			System.out.println("--- 1 ---");
			System.out.println(Integer.parseInt("Zero")); // NumberFormatException
			System.out.println("--- 2 ---");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("--- 3 ---");
		} finally {
			System.out.println("--- 4 ---");
		}

	}

	private static void byZero() {

		try {
			System.out.println(10 / 0); // ArithmeticException
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

	private static void testArrayIndex() {
		int[] sus = new int[10];

		try {
			System.out.println("sus[10] : " + sus[10]); // IndexOutOfBoundsException
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace(); // 에러는 보여주지만 프로그램이 멈추지 않음
		}

	}

	private static void testNullPointer() {
		String x = null;
		x = "kimhyoju";

		try {
			System.out.println("try : " + x.length()); // NullPointerException 발생
		} catch (NullPointerException e) {
			System.out.println("catch");
			x = "";
			System.out.println("catch : " + x.length());
		}
	}
} // end class
