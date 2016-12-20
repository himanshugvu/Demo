package org.javaproject.spring;

import java.util.List;

public class Triangle1 {
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw(){
		for(Point point:points){
			System.out.println("Point = ( "+point.getX()+","+point.getY()+" )");
		}
	}

}
