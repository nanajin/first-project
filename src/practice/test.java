package practice;

import java.io.*;
import java.util.*;

public class test {
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=0;i<num;i++) {
			String str= sc.next();
			for(int j=1;j<str.length();j++) {
				if(str.charAt(j) == str.charAt(0)) {
					continue;
				}
			}
			count++;
		}
		System.out.println(count);
		
		// 실행 시간 측정
				long start = System.currentTimeMillis();
				 
				for (int i = 0; i < 100; i++) {
				    for (int j = 0; j < 100; j++) {
				        for (int j2 = 0; j2 < 1000; j2++) {
				            int k = 5;
				        }
				    }
				}
				 
				long end = System.currentTimeMillis();
				System.out.println("수행 시간:");
				System.out.println((end - start)/1000.0);
	}
}

