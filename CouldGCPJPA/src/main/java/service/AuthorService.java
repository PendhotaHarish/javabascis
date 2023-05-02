package service;

import model.Author;

public interface AuthorService 
{
	public void insert(Author au);
	public void update(int id,Long phone,String fns);
	public void remove(int id);
}
