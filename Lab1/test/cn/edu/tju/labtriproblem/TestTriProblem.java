package cn.edu.tju.labtriproblem;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import cn.edu.tju.labtriproblem.TriProblem;
@RunWith(Parameterized.class)

public class TestTriProblem {
	private int excepted;
	private int testNumber;
	
	public TestTriProblem(int _excepted, int _testNumber) {
		this.excepted = _excepted;
		this.testNumber = _testNumber;
	}
	
	@Parameters
	public static List<Integer[]> parameters() {
		return Arrays.asList(new Integer[][]{
			{1,83}, {0,84}, {0,-1}, {1,0}, 
			{1,51}, {1,21}, {1,6}, {1,11},
			{1,83}, {0,54}, {0,24}, {0,79},{1,5}});
	}
	
	@Test
	public void testTriProblem() {
		TriProblem triPro = new TriProblem();
		String exceptedString = excepted==1?"True":"False";
		System.out.println("Excepted: " + exceptedString + ". Given Number: " + testNumber);
		
		org.junit.Assert.assertEquals(excepted, triPro.testGivenNumber(testNumber));
	}
	

}
