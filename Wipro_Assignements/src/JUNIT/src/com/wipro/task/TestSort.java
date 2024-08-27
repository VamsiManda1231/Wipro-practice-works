package com.wipro.task;
import org.junit.Assert;
import org.junit.Test;

public class TestSort {

	@Test
	public void test() {
		DailyTasks a =new DailyTasks();
		int[] input = {2,3,4,1,5};
		int[] exout = {1,2,3,4,5};
		int[] out =a.sortValues(input);
		Assert.assertArrayEquals(exout, out);
	}
	
}
