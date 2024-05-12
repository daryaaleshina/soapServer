package soapServer;

public interface BookService
{
    public boolean  addBook   (Book p);
    public boolean  deleteBook(int id);
    public Book   getBook   (int id);
    public Book[] getBooks  ();
    public boolean updatetBook  (Book p);
}
