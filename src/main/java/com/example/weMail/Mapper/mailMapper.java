package com.example.weMail.Mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.weMail.Model.mailModel;

@Mapper
@Repository
public interface mailMapper {
	List<mailModel> getAllMail();
}
