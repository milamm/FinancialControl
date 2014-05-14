package com.mila.financialcontrol.model;

public class Conta {

	private String name;
	private Float initialAmount;
	
	public Float getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(Float initialAmount) {
		this.initialAmount = initialAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
