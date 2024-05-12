package soapServer;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class BookServiceImpl implements BookService{
	
	private static Map<Integer,Book> books;
	
	public BookServiceImpl() {
        if (books == null)
        	books = new HashMap<Integer,Book>();
    }
	@Override
	public boolean addBook(Book p) {
        if (books.get(p.getId()) != null)
            return false;
        books.put(p.getId(), p);
        return true;
    }
	
	@Override
	public boolean deleteBook(int id) {
		if (books.get(id) == null)
            return false;
		books.remove(id);
        return true;
	}
	
	@Override
	public Book getBook(int id) {
		return books.get(id);
	}
	
	@Override
	public Book[] getBooks() {
		Set<Integer> ids = books.keySet();
		Book[] p = new Book[ids.size()];
        int i = 0;
        for(Integer id : ids){
            p[i] = books.get(id);
            i++;
        }
        return p;
	}

	@Override
	public boolean updatetBook(Book p) {
		if (books.get(p.getId()) != null) {
			books.put(p.getId(), p);
			return true;
		}
        return false;
	}

}