package com.abstraction.activities;

public class GroupOne extends TeamLead{

	@Override
	void doTask() {
		System.out.println("Do task in Java");
	}
	//own method
	void printTools() {
		System.out.println("Maven, Git, Jenkins");
	}

}
