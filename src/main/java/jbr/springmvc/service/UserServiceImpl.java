package jbr.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.CaseDetails;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.UnAssignedCases;
import jbr.springmvc.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	public void register(User user) {
		userDao.register(user);
	}

	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

	public List<UnAssignedCases> getUnAssignedCases() {
		return userDao.getUnAssignedCases();
	}

	public List<UnAssignedCases> getAssignedCases() {
		return userDao.getAssignedCases();
	}
	
	public CaseDetails getCaseDetails(String caseID) {
		return userDao.getCaseDetails(caseID);
	}
}