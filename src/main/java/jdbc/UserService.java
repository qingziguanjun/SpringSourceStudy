package jdbc;

import java.util.List;

public interface UserService {
	public void save(User s);
	public List<User> getUsers();
	
}
