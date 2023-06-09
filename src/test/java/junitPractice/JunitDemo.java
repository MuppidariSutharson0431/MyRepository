package junitPractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {

	@Test
	public void tc1() {
		System.out.println("iam inside tc1");
	}

	@Test
	public void tc3() {
		System.out.println("iam inside tc3");
	}

	@Test
	public void tc2() {
		System.out.println("iam inside tc2");
	}

	@Before
	public void before2() {
		System.out.println("before2");

	}

	@Before
	public void before1() {
		System.out.println("before1");

	}

	@After
	public void after2() {
		System.out.println("after2");

	}

	@After
	public void after1() {
		System.out.println("after1");

	}

	@BeforeClass
	public static void beforeClass2() {
		System.out.println("beforeclass2");

	}

	@BeforeClass
	public  static void beforeClass1() {
		System.out.println("beforeclass1");

	}
	 
	 @AfterClass
	 public static void afterClass1() {
			System.out.println("afterclass1");

		}
	 
	 @AfterClass
	 public  static void afterClass2() {
			System.out.println("afterclass2");

		}
	 
	


}
