package com.lab111.labwork6;

/*
Клас, який представляє один з елементів комп'ютера - відео-карту з певними її характеристиками.
Імлементує інтерфейс ComputerPart та має accept, який викликає відповідний метод відвідувача
 */

public class VideoCard implements ComputerPart{
	private int power;
	private String model;
	private String slots;
	private int shaders;

	public VideoCard(int power, String model, int shaders, String slots) {
		this.power = power;
		this.model = model;
		this.shaders = shaders;
		this.slots = slots;
	}

	public int getPower() {
		return power;
	}

	public String getModel() {
		return model;
	}

	public String getSlots() {
		return slots;
	}

	public int getShaders() {
		return shaders;
	}

	@Override
	public int accept(ComputerVisitor visitor) {
		return visitor.visitVideoCard(this);
	}
}
