package testprograms;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NumOpsTest {
	
	NumOps ops;
		
	@Before
	public void setup() {
		ops = new NumOps(10, 5);
	}
		
	@Test
	public void testAdd() {	
		assertTrue(ops.add() == 15.0);
	}
		
	@Test
	public void testDivide() {	
		assertTrue(ops.divide() == 2.0);
	}
		
	@Test
	public void testDivideFaulty() {	
		assertTrue(ops.divide() == 3.0);
	}
	
	public static void main(String[] args) {
		
	}

}
