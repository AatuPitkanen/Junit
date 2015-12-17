/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import junit.framework.TestCase;

/**
 * @author ade
 */
public class UtilsJunitTestit extends TestCase {

    public UtilsJunitTestit(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("* utilsTest: setUp() method");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("* utilsTest: tearDown() method");
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    public void testHelloWorld() {
        System.out.println("* test method 1 - testHelloWorld()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }

    public void testExpectedException() {
        System.out.println("*test method 2 - testExpectedException()");
        try {
            final int factorialOf = -5;
            System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            fail("IllegalArgumentException was expected");
        } catch (IllegalArgumentException ex) {
        }
    }
}
