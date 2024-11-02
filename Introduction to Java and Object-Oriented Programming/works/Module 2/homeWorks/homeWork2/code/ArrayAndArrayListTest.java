package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

	// declare myArrayAndArrayList which is the object for testing
	ArrayAndArrayList myArrayAndArrayList;
	
	@BeforeEach
	void setUp() throws Exception {
		// initialize myArrayAndArrayList for testing
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}
	
	/**
	 * Test howMany method in ArrayAndArrayList.
	 */
	@Test
	void testHowMany() {
		// element in the array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
		
		// TODO write at least 3 additional test cases
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 3));
		assertEquals(1, this.myArrayAndArrayList.howMany(array, 9));
		assertEquals(0, this.myArrayAndArrayList.howMany(array, 20));
		
	}
	
	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {
		// findMax in an nonEmpty array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(9, this.myArrayAndArrayList.findMax(array));
		
		// TODO write at least 3 additional test cases
		int[] array1 = {};
		assertEquals(-1, this.myArrayAndArrayList.findMax(array1));
		int[] array2 = {1, -100, 400,4,-50};
		assertEquals(400, this.myArrayAndArrayList.findMax(array2));
		int[] array3 = {-99};
		assertEquals(-99, this.myArrayAndArrayList.findMax(array3));
		
	}

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {
		// test a valid array. 
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		ArrayList<Integer> testArrayList = new ArrayList<Integer>();
		testArrayList.add(9);
		assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
		
		// TODO write at least 3 additional test cases
		int[] array1 = {};
		ArrayList<Integer> testArrayList1 = new ArrayList<Integer>();
		assertEquals(testArrayList1, this.myArrayAndArrayList.maxArray(array1));

		int[] array2 = {9,9,2};
		ArrayList<Integer> testArrayList2 = new ArrayList<Integer>();
		testArrayList2.add(9);
		testArrayList2.add(9);
		assertEquals(testArrayList2, this.myArrayAndArrayList.maxArray(array2));

		int[] array3 = {1, 3,50,40,30,20,-100};
		ArrayList<Integer> testArrayList3 = new ArrayList<Integer>();
		testArrayList3.add(50);
		assertEquals(testArrayList3, this.myArrayAndArrayList.maxArray(array3));
		
	}

	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	void testSwapZero() {
		// test an array containing 0
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array);
		assertArrayEquals(testArray, array);
		
		
		// TODO write at least 3 additional test cases
		int[] array1 = {0, 1, 0, 2, 0, 0, 5,0};
		int[] testArray1 = {1, 2,5,0, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array1);
		assertArrayEquals(testArray1, array1);

		int[] array2 = {};
		int[] testArray2 = {};
		this.myArrayAndArrayList.swapZero(array2);
		assertArrayEquals(testArray2, array2);


		int[] array3 = {0, 1, 0, 2, 0, 3, 0, 10};
		int[] testArray3 = {1, 2, 3, 10, 0, 0, 0,0};
		this.myArrayAndArrayList.swapZero(array3);
		assertArrayEquals(testArray3, array3);

	}
}
