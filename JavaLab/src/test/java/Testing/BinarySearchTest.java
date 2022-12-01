package Testing;

import Experiments.BinarySearch;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void Test1() {
        BinarySearch b1=new BinarySearch();
        int[] expected=new int[]{2, 5, 6, 9, 10, 16, 18, 22, 36, 37};
        int actual=6;
        assertEquals(actual, BinarySearch.bSearch(expected,16));
    }
    @Test
    public void Test2() {
        BinarySearch b2=new BinarySearch();
        int[] expected=new int[]{24,28,32,35};
        int actual=2;
        assertEquals(actual, BinarySearch.bSearch(expected,28));
    }
    @Test
    public void Test3() {
        BinarySearch b3=new BinarySearch();
        int[] actual=new int[]{0,8,9,9,10,20,53,59};
        int expected=3;
        assertEquals(expected, BinarySearch.bSearch(actual,9));}
@Test
public void Test4() {
    BinarySearch b4=new BinarySearch();
    int[] expected=new int[]{ 22, 68, 51, 21, 33, 11, 62, 3, 18, 36, 58, 37};
    int actual=7;
    assertEquals(actual, BinarySearch.bSearch(expected,36));}
@Test
public void Test5() {
    BinarySearch b5=new BinarySearch();
    int[] expected=new int[]{13, 31, 37, 43, 51, 53, 54, 59, 62, 71, 73, 74};
    int actual=7;
    assertEquals(actual, BinarySearch.bSearch(expected,54));}}
