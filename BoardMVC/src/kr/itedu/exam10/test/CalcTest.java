package kr.itedu.exam10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {
Calc calc=new Calc();
	@Test
	void test() {
	assertEquals(3,calc.sum(1, 2));
	}

}
