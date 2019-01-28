package com.techtalentsouth.assessmentWeek9.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String first;
	private String last;
	
	public Person(String first, String last) {
		super();
		this.first = first;
		this.last = last;
	}

	public Person() { }
	
	
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", first=" + first + ", last=" + last + "]";
	}

	
}
