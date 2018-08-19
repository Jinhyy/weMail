package com.example.weMail.Mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.weMail.Model.userModel;

@Mapper
@Repository
public interface userMapper {
	List<userModel> getAllUser();
	void registerUser(userModel user);
	String getPassword(userModel user);
}
