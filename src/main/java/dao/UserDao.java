package dao;

import java.io.Serializable;
import java.util.List;

import domain.Users;

public interface UserDao {
	
	public Users get(String name);
	
	public Serializable save(Users user);
	
	public  void update(Users user);
	
	public void delete(Users user);
	
	public void delete(Serializable name);
	
	public List<Users> findAll();
	
	public long findCount();

}
