package com.edu60;

import p1.Acc;

public class Test43 extends Acc {

	public static void main(String[] args) {
		Acc obj = new Test43();
		
		
	}

	
	/*
	 * public class Acc {
	 * 		int p;
	 * 		같은 패키지
	 * 
	 * 		private int q;
	 * 		내부클래스만 사용가능
	 * 
	 * 		protected int r;
	 * 		같은 패키지 또는 자식클래스
	 * 
	 * 		public int s;
	 *  	제한없음
	 * }
	 * 
	 * Both p and s are accessible by obj.
	 * -> obj를 통해 p와 s에 접근할 수 있다
	 * 
	 * Only s is accessible by obj.
	 * -> obj를 통해 s만 접근할 수 있다
	 * 
	 * Both r and s are accessible by obj.
	 * -> obj를 통해 r과 s에 접근 할 수 있다
	 * 
	 * p, r, and s are accessible by obj.
	 * -> obj를 통해 p,r,s에 접근할 수 있다
	 * 
	 */
}
