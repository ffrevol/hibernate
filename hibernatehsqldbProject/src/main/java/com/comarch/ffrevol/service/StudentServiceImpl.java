package com.comarch.ffrevol.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comarch.ffrevol.dao.LibraryDAO;
import com.comarch.ffrevol.model.Book;
import com.comarch.ffrevol.model.Student;

@Service( "studentService" )
public class StudentServiceImpl implements StudentService {

	 @Autowired
    private LibraryDAO libraryDao;

	@Override
	public Student getStudent(int id) {
		return libraryDao.getStudent(id);		
	}

	@Override
	public Set<Book> getBookForStudent(int i) {
		return libraryDao.getBookForStudent(i);
	}

}
