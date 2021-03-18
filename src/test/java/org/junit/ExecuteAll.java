package org.junit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({SampleJunitA.class,SampleJunitB.class})

public class ExecuteAll {
	
}
