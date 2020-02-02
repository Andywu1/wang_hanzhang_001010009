package edu.neu.info5100.assignment2.part1;

public class VitalSigns {
	private double age;
	private double rRate;		// respiratory rate
	private double hRate;		// heart rate
	private double blood;		// blood pressure
	private double weight;
	
	public VitalSigns(double age, double rRate, double hRate, double blood, double weight) {
		this.age = age;
		this.rRate = rRate;
		this.hRate = hRate;
		this.blood = blood;
		this.weight = weight;
	}
	
	public VitalSigns() {
		// TODO Auto-generated constructor stub
	}

	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public double getrRate() {
		return rRate;
	}
	public void setrRate(double rRate) {
		this.rRate = rRate;
	}
	public double gethRate() {
		return hRate;
	}
	public void sethRate(double hRate) {
		this.hRate = hRate;
	}
	public double getBlood() {
		return blood;
	}
	public void setBlood(double blood) {
		this.blood = blood;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
