package com.comarch.ffrevol.dao;

import java.util.Set;

import com.comarch.ffrevol.model.Book;
import com.comarch.ffrevol.model.Student;

public interface LibraryDAO {
	Student getStudent( int id );
	Set<Book> getBookForStudent(int i);
}
