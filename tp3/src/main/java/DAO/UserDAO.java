package DAO;
import java.util.*;

import model.User;

public class UserDAO {
 private static ArrayList<User> users = new ArrayList<>();
 static {
	 String login = "admin1234";
     String password = "pass1234"; 
	 User u = new User(login ,password);
	 users.add(u);
 }
 
 
 public  User validate(String username , String password) {
	 for(User u : users) {
		 if(u.getLogin().equals(username) && u.getPassword().equals(password)) {
			 return u;
			 }
	 }
	 return null; 
 }
 public User findByLogin(String login) {
	 for(User u : users) {
		 if(u.getLogin().equals(login)) {
			 return u;
		 }
	 }
	 return null;
 }
 public boolean register(User user) {
	 if(findByLogin(user.getLogin()) != null) {
		 return false;
	 }
	 users.add(user);
	 return true;
 }
}
