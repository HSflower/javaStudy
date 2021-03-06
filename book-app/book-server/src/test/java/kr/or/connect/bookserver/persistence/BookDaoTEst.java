///**
// * 
// */
//package kr.or.connect.bookserver.persistence;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
////notnullValue()
//import static org.hamcrest.CoreMatchers.*;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import kr.or.connect.bookserver.BookServerApplication;
//import kr.or.connect.domain.Book;
//
///**
// * @author 2983r
// *
// */
//@RunWith(SpringRunner.class)
////@ContextConfiguration(classes = AppConfig.class) //BookLauncher (java - AppConfig)
//@SpringBootTest(classes = BookServerApplication.class)
//@Transactional
//public class BookDaoTEst {
//
//	@Autowired
//	private BookDao dao;
//
//	@Test
//	public void shouldCount() {
//		int count = dao.countBooks();
//		System.out.println(count);
//	}
//	
//	@Test
//	public void shouldInsertAndSelect() {
//		// given
//		Book book = new Book("네이버", "Java 웹개발", 342);
//
//		// when
//		Integer id = dao.insert(book);
//
//		// then
//		Book selected = dao.selectById(id);
//		System.out.println(selected);
//		assertThat(selected.getTitle(), is("Java 웹개발"));
//	}
//	
//	@Test
//	public void shouldDelete() {
//		// given
//		Book book = new Book("네이버 자바", "네이버", 142);
//		Integer id = dao.insert(book);
//
//		// when
//		int affected = dao.deleteById(id);
//
//		// Then
//		assertThat(affected, is(1));
//	}
//	
//	@Test
//	public void shouldUpdate() {
//		// Given
//		Book book = new Book("네이버", "네이버 자바", 142);
//		Integer id = dao.insert(book);
//
//		// When
//		book.setId(id);
//		book.setTitle("네이버 자바2");
//		int affected = dao.update(book);
//
//		// Then
//		assertThat(affected, is(1));
//		Book updated = dao.selectById(id);
//		assertThat(updated.getTitle(), is("네이버 자바2"));
//	}
//	
//	@Test
//	public void shouldSelectAll() {
//		List<Book> allBooks = dao.selectAll();
//		assertThat(allBooks, is(notNullValue()));
//	}
//}
