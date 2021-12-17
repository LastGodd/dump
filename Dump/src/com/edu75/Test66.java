package com.edu75;

import java.util.ArrayList;

abstract class Animal {

}

interface Hunter {

}

class Cat extends Animal implements Hunter {

}

class Tiger extends Cat {

}

public class Test66 {
	public static void main(String[] args) {
		ArrayList<Animal> myList1 = new ArrayList<>();
		myList1.add(new Tiger());
		
		ArrayList<Hunter> myList2 = new ArrayList<>();
		myList2.add(new Cat());
		
		ArrayList<Hunter> myList3 = new ArrayList<>();
		myList3.add(new Tiger());
		
		ArrayList<Tiger> myList4 = new ArrayList<>();
		myList4.add(new Cat());
		
		ArrayList<Animal> myList5 = new ArrayList<>();
		myList5.add(new Cat());
		
		// 자식은 부모를 담을 수 없다. 다형성에 대해 공부하기
	}
}
