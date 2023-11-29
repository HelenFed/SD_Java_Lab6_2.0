package com.lab111.labwork6;

/*
Клас, який представляє один з елементів комп'ютера - процесор з певними її характеристиками.
Імлементує інтерфейс ComputerPart та має accept, який викликає відповідний метод відвідувача
 */

public class CPU implements ComputerPart{
	private int power;
	private int cores;
	private String model;

	public CPU(int power, int cores, String model) {
		this.power = power;
		this.cores = cores;
		this.model = model;
	}

	public int getPower() {
		return power;
	}
	

	public int getCores() {
		return cores;
	}

	public String getModel() {
		return model;
	}

	@Override
	public int accept(ComputerVisitor visitor) {
		return visitor.visitCPU(this);
	}
}
