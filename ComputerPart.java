package com.lab111.labwork6;

/*
Інтерфейс, який визначає метод accept, який дозволяє об'єкту бути
відвіданим відвідувачем. Кожен еелемент комп'ютера (CPU, RAM тощо) реалізує цей інтерфейс
 */

public interface ComputerPart {
	int accept(ComputerVisitor visitor);
}
