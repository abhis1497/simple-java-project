package com.learning.test.service;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.learning.test.model.User;

public class UserService {

	public void createUser(User user, List<User> userList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ID:");
		user.setId(scan.nextInt());
		System.out.println("Username:");
		user.setName(scan.next());
		System.out.println("Age:");
		user.setAge(scan.nextInt());
		System.out.println("weight:");
		user.setWeight(scan.nextDouble());
		System.out.println("gender:");
		user.setGender(scan.next().charAt(0));
		user.setCreatedAt(new Date());
		user.setCreatedBy();
		validateInput(user, userList);
		userList.add(user);
	}
	// update user method
	// create method improve update read delete

	public void display(int id, List<User> userList) {
		if (userList.isEmpty()) {
			System.out.println("Empty userList");
		} else {
			System.out.println(userList.get(id).toString());
		}
	}

	public void displayAll(List<User> userList) {
		System.out.println(userList.toString());
	}

	public void updateUser(int id, List<User> userList) {
		if (id >= userList.size()) {
			System.out.println("ID does not exist.");
		} else {
			deleteUser(id, userList);
			createUser(new User(), userList);

		}
	}

	public void deleteUser(int id, List<User> userList) {
		if (id < userList.size()) {
			userList.remove(id);
		} else {
			System.out.println("ID does not exist.");
		}
	}

	private void validateInput(User user, List<User> userList) {
		// TODO Auto-generated method stub
		// create flow -> check Id already exist -> error
		// create -> create method ID check if exist
		// update flow -> already exist -> not exist error
		// age -> negative
		// gender 3 cases
		// weight -> negative
		boolean error = false;
		if (user.getAge() < 0) {
			System.out.println("Age should be positive");
			error = true;
		}
		if (user.getGender() != 'M' && user.getGender() != 'F') {
			System.out.println("Enter Valid Gender.(M/F)");
			error = true;
		}
		if (user.getWeight() < 0) {
			System.out.println("Weight can't be negative.");
			error = true;
		}

		if (error)
			System.exit(0);

	}

}
