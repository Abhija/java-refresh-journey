package com.java.basics.samplesndnotes;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Test");

		/**
		 * In Context of a frameork based application where is the main method
		 * 
		 * Its Role: This $\text{main}$ method's sole purpose is to launch the Spring
		 * Container (the $\text{ApplicationContext}$). It hands control immediately to
		 * the Spring framework .The Magic: The SpringApplication.run() method does the
		 * heavy lifting:It scans your project for Spring annotations
		 * ($\text{@Component, @Service, @Controller}$, etc.).It creates, configures,
		 * and manages all your objects (Beans).It starts the embedded web server (like
		 * Tomcat or Jetty) if you're building a web application.The Result: Once the
		 * container is running, the application waits for external triggers (like an
		 * $\text{HTTP}$ request hitting a $\text{@RestController}$ endpoint). You don't
		 * need another $\text{main}$ method because the application is now
		 * event-driven, not sequence-driven.
		 */
	}

}
