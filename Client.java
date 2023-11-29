package com.lab111.labwork6;

/*
Клас, який створює об'єкт комп'ютера та викликає метод accept для об'єкта ComputerVisitorImpl,
тим самим викликаючи обхід структури комп'ютера відвідувачем.
 */

public class Client {
	public static void main(String[] args) {
		//Варіант завдання
		int var = 1128 % 10;
		System.out.println("Варіант завдання: " + var);

		ComputerPart computer = new Computer();
		computer.accept(new ComputerVisitorImpl());
	}
}
