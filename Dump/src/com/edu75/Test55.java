package com.edu75;

public class Test55 {
	public static void main(String[] args) {
		int iVar = 100;
		float fVar = 100.100f;
		double dVar = 123;
		//iVar = fVar;
		fVar = iVar;
		dVar = fVar;
		//fVar = dVar;
		dVar = iVar;
		//iVar = dVar;
		
		// byte < short < int < long < float < long
		// 자신의 타입보다 크면 자동형변환 되지만 작은경우로 변환하려면 강제변환 해야한다
	}
}
