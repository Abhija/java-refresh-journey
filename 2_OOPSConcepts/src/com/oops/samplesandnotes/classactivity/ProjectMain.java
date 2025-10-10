package com.oops.samplesandnotes.classactivity;

public class ProjectMain {

	public static void main(String[] args) {
		Project project = new Project();

		String[] tools = project.showTools();
		System.out.println("The tools are");
		for (String tool : tools) {
			System.out.println(tool);
		}
		System.out.println("The project is " + project.getProjectInfo());

	}

}
