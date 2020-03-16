package co.jp.springboot.service;

import java.util.List;

import co.jp.springboot.dao.Dao;
import co.jp.springboot.po.User;

public class UserService {
	private Dao dao;

	public int createUser(String userId, String password) throws Exception {
		User user = new User();
		user.setUserId(userId);
		user.setPassword(password);
		return dao.insert(user);
	}
	public List<User> getUsers() throws Exception{
		return dao.getUsers();
	}
}
