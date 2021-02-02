package simpleCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
	SimpleCalculator calc = new SimpleCalculator();
	assertEquals(calc.add(1, 1), 2);
	}
	
@Test
public void testSub() {
	SimpleCalculator calc = new SimpleCalculator();
	assertEquals(calc.sub(1, 1), 0);
	}

@Test
public void testMul() {
	SimpleCalculator calc = new SimpleCalculator();
	assertEquals(calc.mul(3, 5), 15);
	}

@Test
public void testDiv() {
	SimpleCalculator calc = new SimpleCalculator();
	assertEquals(calc.div(8, 2), 4);
	}

@Test
public void testSquare() {
	SimpleCalculator calc = new SimpleCalculator();
	assertEquals(calc.square(2), 4);
	}

@Test
public void testCube() {
	SimpleCalculator calc = new SimpleCalculator();
	assertEquals(calc.cube(2), 8);
	}
}
