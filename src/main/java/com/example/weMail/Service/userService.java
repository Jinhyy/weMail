package com.example.weMail.Service;

import com.example.weMail.Mapper.userMapper;
import com.example.weMail.Model.userModel;
import com.example.weMailSecurity.passwordEncryption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class userService {

    @Autowired
    userMapper userMapper;
  
    public List<userModel> getAllUser() {
        return userMapper.getAllUser();
    }
    
    public void registerUser(userModel user) {
    	passwordEncryption pwdInstance = new passwordEncryption();
    	try {
    		String encodedPassword = pwdInstance.getEncSHA256(user.getUser_password());
			user.setUser_password(encodedPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	userMapper.registerUser(user);
    	System.out.println(user.toString());
    }
}