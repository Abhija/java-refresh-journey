package com.oops.samplesandnotes.classactivity;

public class Project {
	
	String language;
	String buildTool;
	String framework;

	String[] showTools() {
		String[] toolsArray = new String[3];
		toolsArray[0] = "Maven";
		toolsArray[1] = "Java";
		toolsArray[2] = "Springboot";
		return toolsArray;

	}

	String getProjectInfo() {
		return "sample project";
	}
}
