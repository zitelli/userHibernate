package br.com.alura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.alura.dao.UserDao;
import br.com.alura.domain.User;

@Service
public class UserService { 

  @Autowired
  private UserDao userDao;

  public User findById(Long id) {
	  return userDao.buscarPorId(id);
  }

  public void createUser(User user) {
    userDao.cadastrar(user);
  }
}	
