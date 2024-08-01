package main;

import java.util.PriorityQueue;

import model.Turn;
import service.InternalProcesses; 

public class Main {

	public static void main(String[] args) {
            
            ManipularCSV archivo = new ManipularCSV();
            archivo.leerArchivo("C:\\Users\\ASUS\\Downloads\\Hola.csv");
            
		InternalProcesses processor = new InternalProcesses();
		processor.transformData();
		PriorityQueue<Turn> awardTurns = processor.enqueueAwards();
	}
}