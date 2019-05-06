package week2Capstone;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		Scanner scan = new Scanner(System.in);

		ArrayList<Object> tasks = new ArrayList<Object>();

		Task a = new Task("bob", "clean out fridge", "05/10/2019");
		tasks.add(a);

		do {
			System.out.println("# of tasks: " + tasks.size());

			System.out.println("1. List tasks");
			System.out.println("2: Add task");
			System.out.println("3. Delete tasks");
			System.out.println("4. Mark task complete");
			System.out.println("5. Quit");
			System.out.println();
			System.out.println("what would you like to do? ");

			input = scan.nextLine();
			while (!(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4")
					|| input.equals("5"))) {
				System.out.println("please enter a valid command");
				input = scan.nextLine();
			}
			// 1 list tasks
			if (input.equals("1")) {
				if (tasks.size() == 0) {
					System.out.println("there are no tasks");
					continue;
			}
				System.out.println("LIST TASKS");
				for (int i = 0; i < tasks.size(); i++) {
					System.out.println(tasks.get(i).toString());
					System.out.println();
				}
			}

			// 2 add task
			if (input.equals("2")) {
				System.out.println("ADD TASK");
				System.out.println("Team member name: ");
				String newName = scan.nextLine();

				System.out.println("Task Description: ");

				String newDesc = scan.nextLine();
				System.out.println("Due Date");
				String newDate = scan.nextLine();

				tasks.add(new Task(newName, newDesc, newDate));
			}
			// 3 delete task
			if (input.equals("3")) {
				if (tasks.size() == 0) {
					System.out.println("there are no tasks to delete");
					continue;
				}
				System.out.println("which tasks# to delete? ");

				while (scan.hasNextInt() == false) {
					// checks if input is integer
					String str = scan.next();
					System.out.println("you entered: " + str);
					System.out.println("please enter a valid number" + " ");
					// scan.next();
				}
				int del = scan.nextInt();

				while (del < 1 || del > tasks.size()) {
					System.out.println("enter a number inbetween 1 and " + tasks.size());
					while (scan.hasNextInt() == false) {
						// checks if input is integer
						String str = scan.next();
						System.out.println("you entered: " + str);
						System.out.println("please enter a valid number" + " ");
					del = scan.nextInt();
					}
				}
				System.out.println(tasks.get(del - 1));
				System.out.println();
				System.out.println("is this the task you want to remove? (y/n)");


				String areyousure = scan.next();
				if (areyousure.equalsIgnoreCase("y")) {
					tasks.remove(del - 1);
				}

				// scan.next();
			}

			// 4 mark task complete
			if (input.equals("4")) {
				if (tasks.size() == 0) {
					System.out.println("there are no tasks to mark complete");
					continue;
				}
				System.out.println("which task to mark complete? ");
				while (scan.hasNextInt() == false) {
					// checks if input is integer
					String str = scan.next();
					System.out.println("you entered: " + str);
					System.out.println("please enter a valid number" + " ");
				}
				int compl = scan.nextInt();

				while (compl < 1 || compl > tasks.size()) {
					System.out.println("enter a number inbetween 1 and " + tasks.size());
					while (scan.hasNextInt() == false) {
						// checks if input is integer
						String str = scan.next();
						System.out.println("you entered: " + str);
						System.out.println("please enter a valid number" + " ");
						compl = scan.nextInt();
						continue;
					}
					compl = scan.nextInt();
				}


				System.out.println(tasks.get(compl - 1));
				System.out.println();
				System.out.println("is this the task you want to mark complete? (y/n)");
				String areyousure = scan.next();
				if (areyousure.equalsIgnoreCase("y")) {

				((Task) tasks.get(compl - 1)).setComplete(true);
				}
				// scan.next();
			}

			// scan.next();
		} while (!input.equals("5"));

		System.out.println("have a great day");
		scan.close();
	}

}
