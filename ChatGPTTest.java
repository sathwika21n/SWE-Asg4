package chatgpt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatGPTTest {

    @Test
    public void testPushAndPeek() {
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.peek(), "Peek should return the last pushed value");
    }

    @Test
    public void testPopReturnsLastElement() {
        Stack stack = new Stack(2);
        stack.push(5);
        stack.push(15);
        int popped = stack.pop();
        assertEquals(15, popped, "Pop should return the last pushed element");
    }

    @Test
    public void testPopThenPeek() {
        Stack stack = new Stack(2);
        stack.push(100);
        stack.push(200);
        stack.pop();
        assertEquals(100, stack.peek(), "After popping, peek should return the new top");
    }

    @Test
    public void testIsEmptyInitially() {
        Stack stack = new Stack(2);
        assertTrue(stack.isEmpty(), "New stack should be empty");
    }

    @Test
    public void testIsFull() {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        assertTrue(stack.isFull(), "Stack should be full after reaching capacity");
    }

    @Test
    public void testSizeAfterPushAndPop() {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.pop();
        assertEquals(1, stack.size(), "Size should decrease after popping an element");
    }

    @Test
    public void testPushBeyondCapacityThrowsException() {
        Stack stack = new Stack(1);
        stack.push(42);
        Exception exception = assertThrows(IllegalStateException.class, () -> stack.push(43));
        assertEquals("Stack is full", exception.getMessage());
    }

    @Test
    public void testPopFromEmptyThrowsException() {
        Stack stack = new Stack(2);
        Exception exception = assertThrows(IllegalStateException.class, stack::pop);
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    public void testPeekFromEmptyThrowsException() {
        Stack stack = new Stack(3);
        Exception exception = assertThrows(IllegalStateException.class, stack::peek);
        assertEquals("Stack is empty", exception.getMessage());
    }
}
