package com.team.getName.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.team.getName.shapes.Line;
import com.team.getName.shapes.Point;

public class LineTest {

	@Test
	public void LineTest() {
		Point p1 = new Point(1.0, 1.0);
		Point p2 = new Point(2.0, 2.0);

		Line line = new Line(p1, p2);

		double expected = p1.getXpos();
		double actual = line.getP1().getXpos();
		assertEquals("Test the line constructor", expected, actual, 0.1);

	}

	@Test
	public void getLengthTest() {
		Point p1 = new Point(1.0, 1.0);
		Point p2 = new Point(2.0, 2.0);

		Line line = new Line(p1, p2);

		double expected = p1.distanceTo(p2);

		double actual = line.getLength();

		assertEquals("Test the length of the side", expected, actual, 0.1);

	}

	@Test
	public void getSlopeTest() {
		Point p1 = new Point(3, 3);
		Point p2 = new Point(3, 9);

		Line line = new Line(p1, p2);

		double expected = Double.POSITIVE_INFINITY;
		double actual = line.getSlope();

		assertEquals("Test the slope", expected, actual, 0.1);

	}

	@Test
	public void getSlopeTest1() {
		Point p1 = new Point(10, 10);
		Point p2 = new Point(5, 15);

		Line line = new Line(p1, p2);

		double expected = -1;
		double actual = line.getSlope();

		assertEquals("Test the slope", expected, actual, 0.1);

	}

}
