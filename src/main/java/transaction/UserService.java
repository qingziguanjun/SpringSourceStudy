package transaction;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED)
public interface UserService {
	public void save(User s);
	public List<User> getUsers();
	
}
