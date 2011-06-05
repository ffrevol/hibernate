package com.comarch.ffrevol.model;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "STUDENT" )
public class Student implements Serializable {
	
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

	@Column( name = "NAME" )
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@OneToMany( mappedBy = "id" )
	private Set<Book> books;

	public Set<Book> getBooks() {
		return books;
	}

	public String Name() {
		return name;
	}
}