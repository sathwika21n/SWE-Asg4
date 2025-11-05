import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            test.Stack stack1 = new test.Stack((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        test.Stack stack1 = new test.Stack((int) '#');
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        test.Stack stack1 = new test.Stack((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        test.Stack stack1 = new test.Stack((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        java.lang.Class<?> wildcardClass4 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        test.Stack stack1 = new test.Stack(0);
        // The following exception was thrown during execution in test generation
        try {
            stack1.push((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is full");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        test.Stack stack1 = new test.Stack(0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        test.Stack stack1 = new test.Stack((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        test.Stack stack1 = new test.Stack(100);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            test.Stack stack1 = new test.Stack((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        test.Stack stack1 = new test.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        int int4 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        test.Stack stack1 = new test.Stack(0);
        boolean boolean2 = stack1.isFull();
        java.lang.Class<?> wildcardClass3 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        test.Stack stack1 = new test.Stack(0);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        test.Stack stack1 = new test.Stack((int) '#');
        int int2 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        java.lang.Class<?> wildcardClass5 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        test.Stack stack1 = new test.Stack((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        test.Stack stack1 = new test.Stack(1);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        test.Stack stack1 = new test.Stack((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        test.Stack stack1 = new test.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        java.lang.Class<?> wildcardClass5 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            test.Stack stack1 = new test.Stack((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        test.Stack stack1 = new test.Stack((int) 'a');
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        test.Stack stack1 = new test.Stack((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        test.Stack stack1 = new test.Stack((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        test.Stack stack1 = new test.Stack(0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        test.Stack stack1 = new test.Stack(0);
        int int2 = stack1.size();
        java.lang.Class<?> wildcardClass3 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.pop();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        test.Stack stack1 = new test.Stack((int) '#');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        int int7 = stack1.size();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        test.Stack stack1 = new test.Stack((int) '#');
        int int2 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        boolean boolean6 = stack1.isFull();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        stack1.push(52);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        test.Stack stack1 = new test.Stack(2);
        boolean boolean2 = stack1.isFull();
        java.lang.Class<?> wildcardClass3 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        test.Stack stack1 = new test.Stack((int) '#');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        java.lang.Class<?> wildcardClass4 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        test.Stack stack1 = new test.Stack(100);
        int int2 = stack1.size();
        int int3 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        test.Stack stack1 = new test.Stack((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        test.Stack stack1 = new test.Stack(3);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        test.Stack stack1 = new test.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        int int4 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        stack1.push(3);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int11 = stack1.size();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        test.Stack stack1 = new test.Stack((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        stack1.push(0);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        stack1.push(10);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        test.Stack stack1 = new test.Stack(0);
        // The following exception was thrown during execution in test generation
        try {
            stack1.push(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is full");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(3);
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        boolean boolean7 = stack1.isFull();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        test.Stack stack1 = new test.Stack(52);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int9 = stack1.pop();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        test.Stack stack1 = new test.Stack(2);
        boolean boolean2 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        int int8 = stack1.size();
        int int9 = stack1.pop();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        test.Stack stack1 = new test.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push(2);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        test.Stack stack1 = new test.Stack(1);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        stack1.push((int) '4');
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        test.Stack stack1 = new test.Stack(0);
        boolean boolean2 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        stack1.push(10);
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        test.Stack stack1 = new test.Stack(1);
        stack1.push((int) (byte) 1);
        boolean boolean4 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(32);
        int int12 = stack1.size();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.peek();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        boolean boolean14 = stack1.isFull();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(32);
        int int12 = stack1.pop();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        stack1.push((int) (short) 0);
        boolean boolean11 = stack1.isFull();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        int int7 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        test.Stack stack1 = new test.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push(0);
        boolean boolean8 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        test.Stack stack1 = new test.Stack(52);
        stack1.push((int) (short) 1);
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        stack1.push((int) 'a');
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (byte) 100);
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        stack1.push((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        test.Stack stack1 = new test.Stack((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        test.Stack stack1 = new test.Stack(52);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        test.Stack stack1 = new test.Stack(32);
        boolean boolean2 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isFull();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        int int9 = stack1.pop();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        java.lang.Class<?> wildcardClass5 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        boolean boolean2 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.size();
        stack1.push((int) ' ');
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        stack1.push(52);
        boolean boolean15 = stack1.isFull();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        stack1.push(52);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isFull();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        stack1.push((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 0);
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        stack1.push((int) (short) 0);
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        test.Stack stack1 = new test.Stack(0);
        int int2 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        stack1.push((-1));
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        int int7 = stack1.size();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        test.Stack stack1 = new test.Stack((int) '4');
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push(2);
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        test.Stack stack1 = new test.Stack((int) ' ');
        boolean boolean2 = stack1.isFull();
        stack1.push(52);
        boolean boolean5 = stack1.isFull();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        stack1.push(97);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        stack1.push((-1));
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.size();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        stack1.push(3);
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        test.Stack stack1 = new test.Stack((int) '#');
        boolean boolean2 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        test.Stack stack1 = new test.Stack(100);
        int int2 = stack1.size();
        int int3 = stack1.size();
        boolean boolean4 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass5 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        test.Stack stack1 = new test.Stack(10);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        test.Stack stack1 = new test.Stack((int) (byte) 100);
        stack1.push(2);
        int int4 = stack1.peek();
        int int5 = stack1.pop();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        int int8 = stack1.size();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        boolean boolean14 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        stack1.push(0);
        boolean boolean14 = stack1.isFull();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        test.Stack stack1 = new test.Stack((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        int int13 = stack1.size();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push(2);
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.size();
        boolean boolean17 = stack1.isFull();
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        stack1.push((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        test.Stack stack1 = new test.Stack((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        test.Stack stack1 = new test.Stack(2);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        test.Stack stack1 = new test.Stack(2);
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (byte) 100);
        boolean boolean5 = stack1.isFull();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        stack1.push(0);
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.size();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        test.Stack stack1 = new test.Stack(2);
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(32);
        int int12 = stack1.size();
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isFull();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) 'a');
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        stack1.push(10);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) 100);
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        test.Stack stack1 = new test.Stack(0);
        boolean boolean2 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass3 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        test.Stack stack1 = new test.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        test.Stack stack1 = new test.Stack((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        boolean boolean2 = stack1.isFull();
        java.lang.Class<?> wildcardClass3 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        test.Stack stack1 = new test.Stack((int) ' ');
        boolean boolean2 = stack1.isFull();
        stack1.push(52);
        java.lang.Class<?> wildcardClass5 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        test.Stack stack1 = new test.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass4 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int14 = stack1.pop();
        stack1.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 0);
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        boolean boolean17 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 0);
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 0);
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(0);
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        test.Stack stack1 = new test.Stack(0);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        java.lang.Class<?> wildcardClass5 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        stack1.push((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        stack1.push((int) (short) 1);
        int int16 = stack1.pop();
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        stack1.push((int) (short) 0);
        int int17 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.pop();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.peek();
        stack1.push((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        stack1.push((int) 'a');
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        int int8 = stack1.size();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 0);
        int int11 = stack1.pop();
        int int12 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        test.Stack stack1 = new test.Stack((int) (short) 0);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        stack1.push((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        int int13 = stack1.size();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean15 = stack1.isFull();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        test.Stack stack1 = new test.Stack(4);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        int int11 = stack1.size();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(52);
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        test.Stack stack1 = new test.Stack(4);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push(2);
        boolean boolean6 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        int int14 = stack1.size();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        stack1.push((int) (short) 100);
        boolean boolean8 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        int int8 = stack1.pop();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        stack1.push(52);
        int int15 = stack1.pop();
        int int16 = stack1.peek();
        boolean boolean17 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        test.Stack stack1 = new test.Stack((int) (byte) 100);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        stack1.push((int) (byte) 10);
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.size();
        stack1.push((int) ' ');
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) (byte) 1);
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(32);
        int int12 = stack1.size();
        int int13 = stack1.peek();
        int int14 = stack1.size();
        boolean boolean15 = stack1.isFull();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        test.Stack stack1 = new test.Stack(52);
        boolean boolean2 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        test.Stack stack1 = new test.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass5 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push((int) '#');
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        test.Stack stack1 = new test.Stack((int) ' ');
        boolean boolean2 = stack1.isFull();
        stack1.push(52);
        boolean boolean5 = stack1.isFull();
        stack1.push((int) 'a');
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        stack1.push((-1));
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        test.Stack stack1 = new test.Stack(32);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.peek();
        stack1.push((int) (short) 0);
        stack1.push(100);
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        stack1.push(1);
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        stack1.push((int) '#');
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        stack1.push((-1));
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        int int8 = stack1.pop();
        stack1.push(35);
        stack1.push((-1));
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        stack1.push(10);
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        test.Stack stack1 = new test.Stack((int) '#');
        stack1.push((int) (byte) -1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int14 = stack1.size();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        stack1.push((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        stack1.push((int) (byte) -1);
        int int11 = stack1.peek();
        stack1.push((int) (byte) -1);
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.pop();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.peek();
        stack1.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        test.Stack stack1 = new test.Stack(5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        test.Stack stack1 = new test.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        stack1.push((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.size();
        stack1.push((int) ' ');
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        stack1.push(52);
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        test.Stack stack1 = new test.Stack(52);
        boolean boolean2 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 0);
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        test.Stack stack1 = new test.Stack(52);
        stack1.push(0);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) 10);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        test.Stack stack1 = new test.Stack(97);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push(0);
        stack1.push((int) (short) -1);
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        int int14 = stack1.size();
        boolean boolean15 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass3 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        test.Stack stack1 = new test.Stack(97);
        int int2 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        int int7 = stack1.size();
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        int int6 = stack1.size();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 1);
        stack1.push((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        stack1.push((int) (byte) 0);
        int int9 = stack1.peek();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) 'a');
        int int15 = stack1.size();
        int int16 = stack1.pop();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        test.Stack stack1 = new test.Stack(0);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        java.lang.Class<?> wildcardClass4 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean6 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        test.Stack stack1 = new test.Stack(4);
        boolean boolean2 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        stack1.push(0);
        stack1.push((int) '4');
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(1);
        int int10 = stack1.pop();
        stack1.push((int) (byte) 1);
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        stack1.push((-1));
        int int11 = stack1.peek();
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        stack1.push((int) ' ');
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        stack1.push((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        stack1.push(100);
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        int int15 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 0);
        boolean boolean11 = stack1.isFull();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(0);
        int int12 = stack1.size();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isFull();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        test.Stack stack1 = new test.Stack((int) (short) 1);
        int int2 = stack1.size();
        java.lang.Class<?> wildcardClass3 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 0);
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        boolean boolean17 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        test.Stack stack1 = new test.Stack(52);
        stack1.push((int) (short) 1);
        stack1.push((int) (short) 0);
        int int6 = stack1.size();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        test.Stack stack1 = new test.Stack(100);
        int int2 = stack1.size();
        int int3 = stack1.size();
        boolean boolean4 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        stack1.push(0);
        int int13 = stack1.pop();
        int int14 = stack1.pop();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isFull();
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        test.Stack stack1 = new test.Stack(2);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        java.lang.Class<?> wildcardClass4 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(0);
        int int12 = stack1.peek();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(32);
        int int12 = stack1.size();
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        test.Stack stack1 = new test.Stack(97);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean15 = stack1.isEmpty();
        stack1.push((int) (byte) 100);
        stack1.push(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        test.Stack stack1 = new test.Stack((int) (short) 100);
        boolean boolean2 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        int int12 = stack1.pop();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        stack1.push((int) '#');
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(3);
        stack1.push((int) (byte) 10);
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push(0);
        stack1.push((int) (short) -1);
        stack1.push((int) (short) 1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(0);
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isFull();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        test.Stack stack1 = new test.Stack((int) (byte) 100);
        stack1.push(2);
        int int4 = stack1.peek();
        stack1.push(97);
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        stack1.push((int) 'a');
        stack1.push((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(3);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        stack1.push((int) (byte) 0);
        int int16 = stack1.pop();
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        int int10 = stack1.size();
        stack1.push((int) '#');
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push(2);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        stack1.push(2);
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        stack1.push(10);
        boolean boolean13 = stack1.isFull();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) ' ');
        stack1.push(32);
        int int17 = stack1.pop();
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        test.Stack stack1 = new test.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        int int11 = stack1.peek();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        stack1.push(52);
        int int15 = stack1.pop();
        int int16 = stack1.peek();
        stack1.push(2);
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        test.Stack stack1 = new test.Stack((int) (byte) 100);
        stack1.push(2);
        int int4 = stack1.peek();
        stack1.push((int) ' ');
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        int int9 = stack1.pop();
        stack1.push((int) (byte) 1);
        stack1.push((-1));
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.size();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        int int15 = stack1.size();
        int int16 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) (byte) 1);
        stack1.push(52);
        stack1.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        test.Stack stack1 = new test.Stack((int) '#');
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.pop();
        int int14 = stack1.pop();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) 'a');
        int int12 = stack1.size();
        stack1.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        test.Stack stack1 = new test.Stack(32);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        stack1.push((int) 'a');
        int int10 = stack1.pop();
        stack1.push((int) (short) 100);
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        stack1.push(35);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        stack1.push(32);
        boolean boolean15 = stack1.isFull();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        int int12 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) ' ');
        int int15 = stack1.peek();
        stack1.push(1);
        int int18 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        stack1.push((int) ' ');
        int int15 = stack1.size();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(1);
        int int10 = stack1.pop();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        test.Stack stack1 = new test.Stack((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(1);
        int int10 = stack1.pop();
        stack1.push((int) (byte) 1);
        int int13 = stack1.size();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        stack1.push((int) (byte) -1);
        int int11 = stack1.peek();
        int int12 = stack1.peek();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        test.Stack stack1 = new test.Stack(2);
        boolean boolean2 = stack1.isFull();
        stack1.push(0);
        int int5 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        int int14 = stack1.peek();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        test.Stack stack1 = new test.Stack((int) (short) 1);
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 0);
        stack1.push(4);
        boolean boolean15 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        test.Stack stack1 = new test.Stack((int) '#');
        stack1.push((int) (short) 0);
        java.lang.Class<?> wildcardClass4 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        test.Stack stack1 = new test.Stack((int) '#');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) 'a');
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push(2);
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        test.Stack stack1 = new test.Stack((int) ' ');
        boolean boolean2 = stack1.isFull();
        stack1.push(52);
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        stack1.push((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean15 = stack1.isFull();
        stack1.push(10);
        stack1.push((int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        test.Stack stack1 = new test.Stack((int) '#');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        stack1.push((int) ' ');
        int int7 = stack1.peek();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        test.Stack stack1 = new test.Stack((int) (short) 0);
        int int2 = stack1.size();
        int int3 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        stack1.push((int) '#');
        int int17 = stack1.pop();
        int int18 = stack1.pop();
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push((int) (short) 10);
        int int13 = stack1.size();
        stack1.push((int) (short) -1);
        int int16 = stack1.size();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        test.Stack stack1 = new test.Stack((int) 'a');
        stack1.push(2);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        stack1.push(4);
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        stack1.push(32);
        stack1.push(5);
        int int17 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(52);
        int int10 = stack1.size();
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        test.Stack stack1 = new test.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }
}

