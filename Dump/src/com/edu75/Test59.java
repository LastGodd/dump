package com.edu75;

class Planet {
	public String name;
	public int moons;
	
	public Planet(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}
}

public class Test59 {

	public static void main(String[] args) {
		Planet[] planets = {
			new Planet("Mercury", 0),
			new Planet("Venus", 0),
			new Planet("Earth", 1),
			new Planet("Mars", 2)
		};
		
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
		
		/*
		 * [Lcom.edu60.Planet;@5aaa6d82
		 * com.edu60.Planet@73a28541
		 * 1
		 * 
		 */
	}

}
