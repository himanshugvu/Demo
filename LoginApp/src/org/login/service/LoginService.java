package org.login.service;

public class LoginService {

	public boolean authenticate(String password){
		if(password==null || password.trim()==""){
			return false;
		}
		return true;
		
	}
}
