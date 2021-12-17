package com.edu25;

interface Readable {
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable { // line n1
	public void readBook() { }
	// line n2
	public abstract void setBookMark();
}

public class Test11 extends Book { // line n3
	
	@Override
	public void setBookMark() { }
	
	// line n4
	
}
