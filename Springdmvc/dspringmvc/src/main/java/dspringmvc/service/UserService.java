package dspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dspringmvc.dao.UserDao;
import dspringmvc.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		
		return this.userDao.saveUser(user);
		
	}

}
