package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] student = new Student[10]; //Quartos de 0 a 9
		
		System.out.print("How many Students will be rented? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			student[room] = new Student(name, email);
			
		}
		
		System.out.println("Busy Rooms: ");
		
		for(int i=0; i<10; i++) {
			if (student[i] != null) {
				System.out.println(i + ": " + student[i].getName() + ", " + student[i].getEmail());
			}
		}
		sc.close();
	}

}
