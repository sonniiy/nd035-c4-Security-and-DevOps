package com.udacity.examples.Testing;

import junit.framework.TestCase;
import org.junit.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class HelperTest {

    @Before
    public void init() {
        System.out.println("Runs before each test");
    }

    @BeforeClass
    public static void setup() {
        System.out.println("runs before the class");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("runs after each class");
    }

    @After
    public void initEnd() {
        System.out.println("runs after each method");
    }

	@Test
    public void test() {
	    assertEquals(2,2);
    }

    @Test
    public void verify_getCount() {
	    List<String> empNames = Arrays.asList("sonja","udacity");
        long actual = Helper.getCount(empNames);
        assertEquals(2, actual);
    }

    @Test
    public void verify_getStats() {
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        List<Integer> exprectedList = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        IntSummaryStatistics stats = Helper.getStats(yrsOfExperience);
        assertEquals(19, stats.getMax());
        assertEquals(exprectedList, yrsOfExperience);

    }

    @Test
    public void compare_arrays() {
	    int[] yrs = {10,14,2};
	    int[] expectedYrs = {10,14,2};

	    assertArrayEquals(expectedYrs, yrs);
    }

    @Test
    public void merge_lit() {
        List<String> empNames = Arrays.asList("sareeta", "", "john","");
        String actual = "sareeta, john";
        String mergedList = Helper.getMergedList(empNames);
        assertEquals(actual,mergedList);
    }

}
