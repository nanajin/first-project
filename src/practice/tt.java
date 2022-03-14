package practice;

import java.io.*;
import java.util.*;

public class tt {
	public static void main(String[] args)throws IOException{
		int a = 3;
		double b = 1;
		double r = b/a;
		System.out.println(r);
		
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

