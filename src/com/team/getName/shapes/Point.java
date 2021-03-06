package com.team.getName.shapes;

import java.text.DecimalFormat;

public class Point {

	private double xpos;
	private double ypos;

	public Point(double xpos, double ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}

	public double distanceTo(Point p) {
		double xdif = this.xpos - p.xpos;
		double ydif = this.ypos - p.ypos;
		return Math.sqrt(Math.pow(xdif, 2) + Math.pow(ydif, 2));
	}

	public double getXpos() {
		return xpos;
	}

	public String printXpos() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(xpos);
	}

	public void setXpos(double xpos) {
		this.xpos = xpos;
	}

	public double getYpos() {
		return ypos;
	}

	public String printYpos() {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(ypos);
	}

	public void setYpos(double ypos) {
		this.ypos = ypos;
	}

	public String toString() {
		return "(" + printXpos() + "," + printYpos() + ")";
	}

}
