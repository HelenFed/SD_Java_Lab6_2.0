package com.lab111.labwork6;

/*
Інтерфейс, який аизначає методи для відвідування кожного типу об'єкту (елемента комп'ютера)
 */

public interface ComputerVisitor {

	int visitComputer(Computer computer);

	int visitRAM(RAM memory);

	int visitVideoCard(VideoCard video);

	int visitCPU(CPU processor);
}
