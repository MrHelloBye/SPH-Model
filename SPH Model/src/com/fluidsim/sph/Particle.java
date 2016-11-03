package com.fluidsim.sph;

public class Particle {
	double[] position = {0,0,0};
	
	public Particle() { //Need to add a default "no argument" constructor
		
	}
	
	public Particle(double x, double y, double z) {
		position[0] = x;
		position[1] = y;
		position[2] = z;
	}
	
	
	public double[] getPosition() {
		return this.position;
	}
}
