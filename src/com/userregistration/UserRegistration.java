package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first name");
		String firstName = sc.next();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		if (matches) {
			System.out.println("your name is valid");
		} else {
			System.out.println("please enter a valid name");
		}
	}
}
