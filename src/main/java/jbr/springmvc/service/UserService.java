package jbr.springmvc.service;

import java.util.List;

import jbr.springmvc.model.CaseDetails;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.UnAssignedCases;
import jbr.springmvc.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login); //change this to getUser
  
  List<UnAssignedCases> getUnAssignedCases();
  
  List<UnAssignedCases> getAssignedCases();
  
  CaseDetails getCaseDetails(String caseID);
}