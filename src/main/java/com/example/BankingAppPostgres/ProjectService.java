package com.example.BankingAppPostgres;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	
@Autowired
private ProjectRepository repo;

  public Iterable<Project> getAllprojects() {
	  
	  return repo.findAll();
	  
	 
  }

}
