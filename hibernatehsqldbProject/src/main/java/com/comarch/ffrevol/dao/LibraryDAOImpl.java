package com.comarch.ffrevol.dao;
import java.util.List;
import java.util.Set;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.comarch.ffrevol.model.Book;
import com.comarch.ffrevol.model.Student;

public class LibraryDAOImpl extends HibernateDaoSupport implements LibraryDAO {

	private static String FROM_STUDENTS = 
      "from com.comarch.ffrevol.model.Student student where student.id = :id";

	public Student getStudent(int id) {
		try
		{
			// Execute the query to load the HhUploads object
			List results = getHibernateTemplate().findByNamedParam( FROM_STUDENTS, 
                      "id", id);
			
			// It's the primary key, so we only expect one result - return the actual
			// object or return null
			return results.size() > 0 ? ( Student )results.get( 0 ) : null;
		}
		catch( Exception e )
		{
			e.printStackTrace();
			return null;
		} 
	}

	@Override
	public Set<Book> getBookForStudent(int i) {
		return getStudent(i).getBooks();
	}
}