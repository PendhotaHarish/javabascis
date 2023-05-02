package utility;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class AuthorUtility 
{
	public static  EntityManagerFactory getEntityManagerFactory()
	{
		return Persistence.createEntityManagerFactory("PU");
	}
}
