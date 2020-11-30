package heshibo;

import org.junit.Test;

public class maopaoTest {

	//语句覆盖
	@Test
	public void test1() {
		int[] arr= {4,3,2,1};
		test t=new test();
		t.BubbleSort(arr);
	}
	
	//判定覆盖
	@Test
	public void test2() {
		int[] arr= {1,2,3,4};
		test t=new test();
		t.BubbleSort(arr);
	}
	@Test
	public void test3() {
		int[] arr= {4,3,2,1};
		test t=new test();
		t.BubbleSort(arr);
	}
	
	//条件覆盖
	@Test
	public void test4() {
		int[] arr= {1,2,3,4};
		test t=new test();
		t.BubbleSort(arr);
	}
	@Test
	public void test5() {
		int[] arr= {4,3,2,1};
		test t=new test();
		t.BubbleSort(arr);
	}
	
	//路径覆盖
	@Test
	public void test6() {
		int[] arr= {1,2,3,4};
		test t=new test();
		t.BubbleSort(arr);
	}
	@Test
	public void test7() {
		int[] arr= {4,3,2,1};
		test t=new test();
		t.BubbleSort(arr);
	}
	
}

