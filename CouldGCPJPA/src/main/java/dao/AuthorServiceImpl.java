package dao;
import javax.persistence.EntityManager;
import model.Author;
import service.AuthorService;

public class AuthorServiceImpl implements AuthorService
{
	@Override
	public void insert(Author au) 
	{
		EntityManager em=utility.AuthorUtility.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(au);
		em.getTransaction().commit();
	}

	@Override
	public void update(int id,Long phone,String fns) 
	{
		EntityManager em=utility.AuthorUtility.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Author a=em.find(Author.class,id);
		if(a!=null)
		{
			a.setPhoneNo(phone);
			a.setFirstName(fns);
			em.persist(a);
			em.getTransaction().commit();
		}
	}
	@Override
	public void remove(int id) 
	{
		EntityManager em=utility.AuthorUtility.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Author a=em.find(Author.class,id);
	    em.remove(a);
		em.getTransaction().commit();
	}
}
