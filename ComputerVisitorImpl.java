package com.lab111.labwork6;

/*
Клас, який реалізує інтерфейс ComputerVisitor та визначає логіку для обробки кожного типу елемента
 */

public class ComputerVisitorImpl implements ComputerVisitor{
	/*
	Метод, в якому обходиться масив parts, викликаючи метод accept для кожного елемента
	та додаючи його потужність до загальної, яку і повертає цей метод.
	 */
	@Override
	public int visitComputer(Computer computer) {
		// Новий відвідувач для обробки вкладених елементів комп'ютера
		ComputerVisitor visitor = new ComputerVisitorImpl();

		// Загальна потужність комп'ютера
		int total_power = 0;

		// Обхід по всім елементам комп'ютера
		for(ComputerPart part : computer.parts) {
			// Викликаємо метод accept для кожного елемента та додаємо потужність до загальної потужності
			total_power = total_power + part.accept(visitor);
		}
		System.out.println("Computer power consumption: " + total_power);
		return total_power;
	}

	/*
	Методи visit- нижче отримуються потужність конкретного елемента через метод getPower,
	виводять інформацію про потужність елемента та повертаютьс її
	 */

	@Override
	public int visitRAM(RAM memory) {
		int power_consumption = memory.getPower();
		System.out.println("RAM power consumption: " + power_consumption);
		return power_consumption;
		}

	@Override
	public int visitVideoCard(VideoCard video) {
		int power_consumption = video.getPower();
		System.out.println("Video card power consumption: " + power_consumption);
		return power_consumption;
	}

	@Override
	public int visitCPU(CPU processor) {
		int power_consumption = processor.getPower();
		System.out.println("CPU power consumption: " + power_consumption);
		return power_consumption;
	}
}
