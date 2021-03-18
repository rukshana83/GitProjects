package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Counts {
	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(SampleJunitA.class,SampleJunitB.class);
		int failureCount = res.getFailureCount();
		System.out.println("Failure count:"+failureCount);
		
		int ignoreCount = res.getIgnoreCount();
		System.out.println("Ignored count:"+ignoreCount);
		
		int runCount = res.getRunCount();
		System.out.println("Run count:"+runCount);
		
		long runTime = res.getRunTime();
		System.out.println("Runtime:"+runTime);
		
		List<Failure> failures = res.getFailures();
		for (Failure f : failures) {
			System.out.println(f);
		}
		
	
	}

}
