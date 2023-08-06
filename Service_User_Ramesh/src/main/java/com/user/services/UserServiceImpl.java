package com.user.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(
			new User(1311L,"Durgesh Tiwari","9175873130"),
			new User(1312L,"Ankit Tiwari","876543" ),
			new User(1314L,"Ravi Tiwari","2344567" )
          );
	
	
	
	@Override
	public User getUSer(long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user-> user.getUserId()==(id)).findAny().orElse(null);
	}  

}
