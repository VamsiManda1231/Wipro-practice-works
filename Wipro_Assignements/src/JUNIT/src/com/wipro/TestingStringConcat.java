package com.wipro;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestingStringConcat {

	@Test 
	public void test() {
		DailyTasks a= new DailyTasks();
		String s1 = "Abhi";
		String s2 = "Manyu";
		String Out = a.doStringConcat(s1, s2);
		assertEquals("Abhi Manyu",Out);
	}
}
