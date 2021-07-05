package io.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class User{
	
	private int userId;
	private String userName;
	private String emailId;
	
	public User(int userId, String userName, String emailId) {
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getEmailId() {
		return this.emailId;
	}
	
	@Override
	public boolean equals(Object user) {
		User anotherUser = (User) user;
		if(this.emailId.equals(anotherUser.emailId))
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return emailId.hashCode();
	}

	@Override
	public String toString() {
		return "userId=" + userId + ", userName=" + userName + ", emailId=" + emailId;
	}
	
	
}

public class UserTester {

	public static void main(String[] args) {
		/**
		 * User defined classes needs to override the equals() and hashCode() method for detecting duplicate
		 * elements.
		**/
		
		List<User> userlist = new ArrayList<>();
		
		userlist.add(new User(121, "Mike", "mike@gmail.com"));
		userlist.add(new User(122, "Ben", "user@gmail.com"));
		userlist.add(new User(123, "Henry", "henry@gmail.com"));
		userlist.add(new User(124, "Hannah", "user@gmail.com"));
		userlist.add(new User(125, "Elle", "henry@gmail.com"));
		userlist.add(new User(126, "Ryan", "ryan@gmail.com"));
		
		Set<User> items = new HashSet<>();
		items.addAll(userlist);
		
		for(User item : items) {
			System.out.println(item);
		}
		

	}

}
