package com.lab111.labwork6;

/*
Клас, який представляє один з елементів комп'ютера - карту пам'яті з певними її характеристиками.
Імлементує інтерфейс ComputerPart та має accept, який викликає відповідний метод відвідувача
 */

public class RAM implements ComputerPart{
	private int power;
	private int iternal_rate;
	private String model;

	public RAM(int power, int iternal_rate, String model) {
		this.power = power;
		this.iternal_rate = iternal_rate;
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public int getIternalRate() {
		return iternal_rate;
	}

	public String getModel() {
		return model;
	}

	@Override
	public int accept(ComputerVisitor visitor) {
		return visitor.visitRAM(this);
	}
}
