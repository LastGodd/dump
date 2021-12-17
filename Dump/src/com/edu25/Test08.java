package com.edu25;

import java.io.IOException;

class X {
	public void printFileContent() throws IOException {
		/* code goes here */
		throw new IOException();
		// throws IOException
	}
}

public class Test08 {
	public static void main(String[] args) throws IOException {
		X xobj = new X();
		xobj.printFileContent();
		// throws IOException
		// try {} catch {}
	}
}
