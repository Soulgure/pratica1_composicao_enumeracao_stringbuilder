package application;

import java.util.Locale;
import java.util.Scanner;

import entities.info;
import entities.student;
import entities_enum.status;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("==== STUDENT REGISTRATION ====");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Age: ");
		Integer age = sc.nextInt();
		System.out.print("Weight(kg): ");
		Double weight = sc.nextDouble();
		System.out.print("Height(cm): ");
		Double height = sc.nextDouble();
		System.out.print("Status: ");
		status status = entities_enum.status.valueOf(sc.next());

		student student1 = new student(name, age, weight, height, status);

		System.out.print("How many logs do you wish to enter? ");
		Integer M = sc.nextInt();
		sc.nextLine();
		for (int j = 1; j <= M; j++) {
			System.out.print("Extra information: ");
			String info = sc.nextLine();
			info information = new info(info);
			student1.addList(information);
		}

		System.out.println(student1);
	}

}
