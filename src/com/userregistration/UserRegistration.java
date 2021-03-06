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
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		if (matches) {
			System.out.println("your name is valid");
		} else {
			System.out.println("please enter a valid name");
		}
		System.out.println("enter your last name");
		String lastName = sc.next();
		matcher = pattern.matcher(lastName);
		matches = matcher.find();
		if (matches) {
			System.out.println("your last name is valid");
		}else {
			System.out.println("please enter a valid last name");
		}
		
		System.out.println("enter your email");
		String email = sc.next();
		pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
				Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(email);
		matches = matcher.find();
		if (matches) {
			System.out.println("your email is valid");
		}else {
			System.out.println("please enter a valid email");
		}
	
		
		System.out.println("enter your password");
		String password = sc.next();
		pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$",Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(password);
		matches = matcher.find();
		if(matches) {
			System.out.println("password is valid");
		}else {
			System.out.println("enter your valid password");
		}
	}
}
