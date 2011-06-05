package com.comarch.ffrevol.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "BOOK")
public class Book implements Serializable {
	
	/**
     * Serialization id
     */
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column( name = "ID" )
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getCheckedOutTo() {
		return checkedOutTo;
	}

	public void setCheckedOutTo(Student checkedOutTo) {
		this.checkedOutTo = checkedOutTo;
	}

	@Column( name = "NAME" )
	private String name;

	@ManyToOne
	@JoinColumn( name = "CHECKOUT_ID")
	private Student checkedOutTo;
}