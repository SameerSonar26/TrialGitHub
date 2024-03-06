package com.demoProject.exception;

public class InvalidBrowserNameError extends Error {
	private String msg;

	public InvalidBrowserNameError(String browserName) {
		msg = ("\nYou entered Invalid Browser Name\n1)\t" + browserName+" \nBrowser Name should be as follow\n" + "1)\tChrome\n" + "2)\tFireFox\n" + "3)\tEdge\n");

	}

	@Override
	public String toString() {

		return msg;
	}
}
