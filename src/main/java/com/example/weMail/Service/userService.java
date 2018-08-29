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
    passwordEncryption pwdInstance = new passwordEncryption();
    
    public List<userModel> getAllUser() {
        return userMapper.getAllUser();
    }
    
    public void registerUser(userModel user) {
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
    
    public int loginUser(userModel user) {
    	try {
			String user_password = pwdInstance.getEncSHA256(user.getUser_password());
			if(userMapper.getPassword(user).equals(user_password)) {
				System.out.println("로그인성공");
				return 1;
			}
			else {
				System.out.println("로그인실패");
				return -1;
			}
    	}
			catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("로그인에러");
			return 0;
		}
    }
}