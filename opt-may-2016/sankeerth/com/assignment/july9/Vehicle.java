package com.assignment.july9;

public class Vehicle<Register> {
	
	private Register make;
	private Register model;
	private Register chassis;
	
	public Vehicle(Register make, Register model, Register chassis){
		this.make = make;
		this.model = model;
		this.chassis = chassis;
	}

	public Register getMake() {
		return make;
	}

	public void setMake(Register make) {
		this.make = make;
	}

	public Register getModel() {
		return model;
	}

	public void setModel(Register model) {
		this.model = model;
	}

	public Register getChassis() {
		return chassis;
	}

	public void setChassis(Register cost) {
		this.chassis = cost;
	}
	

}
