package com.example.weMail.Mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.weMail.Model.deptModel;

@Mapper
@Repository
public interface deptMapper {
	List<deptModel> getAllDept();
}
