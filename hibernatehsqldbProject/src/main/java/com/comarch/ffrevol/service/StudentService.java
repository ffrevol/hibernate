package com.comarch.ffrevol.service;

import java.util.Set;

import com.comarch.ffrevol.model.Student;
import com.comarch.ffrevol.model.Book;
public interface StudentService {
	Student getStudent(int i);
	Set<Book> getBookForStudent(int i);

}
