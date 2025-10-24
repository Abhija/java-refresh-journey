package com.oops.samplesandnotes.abstractclassactivity;

public class AbstractMain {

	public static void main(String[] args) {
		Bank bank = new RuralBranch();
		// Only the parent class methods can be called
		// If overridden methods are there in the child class, then that
		// will be given precdeence

	
		bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		bank.adminDetails();
		
		/**
		 * Imagine a manufacturing company has a design document for a Vehicle. This
		 * document specifies:
		 * 
		 * Detail Status Wheels: Must have wheels. Engine Type: Must have an engine, but
		 * the specific type (gas, electric, diesel) is unspecified. Movement Method
		 * (move()): Must have a method for movement, but the exact steps are
		 * unspecified (e.g., "drive on pavement," "fly in air," or "sail on water").
		 */
		

		// If we want to call the methods that are available only in
		// the rural branch, then we should downcast it
		RuralBranch ruralBranch = (RuralBranch) bank;
		ruralBranch.depositType();

		bank = new MetroBranch();
		// It will support only the methods available in Bank
		MetroBranch metroBranch = (MetroBranch) bank;
		metroBranch.carLoan();
		metroBranch.eduLoan();
		metroBranch.housingLoan();

		// UrbanBranch urbanBranch = new UrbanBranch() ;
		// Cannot instantiate an Abstract class

		/**
		 * Therefore, Java stops you at the start.4 The compiler enforces the rule: If a
		 * class has abstract methods, it is fundamentally incomplete, and you cannot
		 * create an object from it.
		 * 
		 * The true purpose of an abstract class is not to create objects, but to act as
		 * a contract or a mandatory template for its child classes.
		 * 
		 * The Abstract Class: Defines the "What" (What methods must exist).
		 * 
		 * The Concrete Subclass: Defines the "How" (How those methods actually work).
		 */

	}

}
