package com.example.weMail.Service;

import com.example.weMail.Mapper.deptMapper;
import com.example.weMail.Model.deptModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class deptService {

    @Autowired
    deptMapper deptMapper;
  
    public List<deptModel> getAllDept() {
        return deptMapper.getAllDept();
    }
}