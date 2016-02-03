package org.sireum.bakar.policy.parser;

public class T_Pair<A, B> {
	A first;
	B second;
	
	public T_Pair() {
		
	}
	
	public T_Pair(A first, B second) {
		this.first = first;
		this.second = second;
	}
	
	public A getFirst() {
		return this.first;
	}
	
	public B getSecond() {
		return this.second;
	}
	
	// ---
	public void setFirst(A first) {
		this.first = first;
	}
	
	public void setSecond(B second) {
		this.second = second;
	}	
}
