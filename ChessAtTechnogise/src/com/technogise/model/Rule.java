package com.technogise.model;

public class Rule {
	int numberOfAllowedSteps;
	Directions[] directions;

	public Rule(int numberOfAllowedSteps, Directions[] directions) {
		super();
		this.numberOfAllowedSteps = numberOfAllowedSteps;
		this.directions = directions;
	}

	public int getNumberOfAllowedSteps() {
		return numberOfAllowedSteps;
	}

	public Directions[] getDirections() {
		return directions;
	}
}
