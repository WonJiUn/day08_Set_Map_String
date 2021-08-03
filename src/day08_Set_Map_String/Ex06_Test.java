package day08_Set_Map_String;

import java.util.ArrayList;

import org.apache.commons.lang3.time.StopWatch;

import test.MyTest;

public class Ex06_Test {
	public static void main(String[] args) {
		
		StopWatch stopwatch = new StopWatch();
		
		stopwatch.start();
		
		MyTest m = new MyTest();
		m.test();
		
		ArrayList arr = new ArrayList();
		for(int i = 1; i<100000; i++) {
			arr.add(i);
		}
		
		
		stopwatch.stop();
		System.out.println(stopwatch.getTime());
	}
}
