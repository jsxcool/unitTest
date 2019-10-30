package com.example.learnMokito.dbConnection;

public class UserService {
	
	private UserDAO userdao;
	
	public UserService(UserDAO userdao) {
		this.userdao = userdao;
	}
	
	public User findUser(long id) {
		return userdao.findById(id);
	}
	
	

}
