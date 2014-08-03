package com.packtpub.felix.bookshelf.service.api;

public interface Authentication {
	public String login(String username,char[] password)
		throws InvalidCredentialsException;
	
	public void logout(String sessionId);
	
	public boolean sessionIsValid(String sessionId);
}
