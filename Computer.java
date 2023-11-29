package com.lab111.labwork6;

/*
Клас, який представляє комп'ютер, який складається з певних елементів, для ких визначено необхідні характеристики.
Імпелементує інтерфейс ComputerPart та визначає метод accept, який викликає відповідний метод відвідувача
 */
public class Computer implements ComputerPart{
	ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[]{new RAM(5, 150, "DDR1 RAM"),
				new VideoCard(133, "RX 5500 XT 4GM", 192, "Dual-slot"),
				new CPU(85, 8, "Intel Core i7 11700")};
	}

	@Override
	public int accept(ComputerVisitor visitor) {
		return visitor.visitComputer(this);
	}
}
