package com.fluidsim.sph;

import java.util.Arrays;
import com.fluidsim.sph.Particle;

public class Main {

	public static void main(String[] args) {
		Particle part1 = new Particle(2.,3.,4.);
		
		System.out.println(Arrays.toString(part1.getPosition()));
	}

}
