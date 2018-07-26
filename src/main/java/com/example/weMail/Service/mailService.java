package com.example.weMail.Service;

import com.example.weMail.Mapper.mailMapper;
import com.example.weMail.Model.mailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class mailService {

    @Autowired
    mailMapper mailMapper;
  
    public List<mailModel> getAllMail() {
        return mailMapper.getAllMail();
    }
}
