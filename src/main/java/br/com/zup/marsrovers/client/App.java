package br.com.zup.marsrovers.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import br.com.zup.marsrovers.rover.Rover;

public class App
{
    public static void main(String[] args) throws IOException{


		BufferedReader readLine = new BufferedReader(new InputStreamReader(System.in));
		
		String input1 = readLine.readLine();
		String input2 = readLine.readLine();
		String movements = readLine.readLine();

		Rover rover;
		
		do{
			rover = new Rover();
			rover.process(input1, input2, movements);
			System.out.println(rover.getLocation());
			
			input2 = readLine.readLine();
			movements = readLine.readLine();
			
		} while(input2 != null);
	}
}
