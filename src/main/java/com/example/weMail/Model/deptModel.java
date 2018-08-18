package com.example.weMail.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class deptModel {
	/*
    `dept_no`        INT             NOT NULL    AUTO_INCREMENT COMMENT 'dept_no', 
    `dept_name`      VARCHAR(45)     NOT NULL    COMMENT 'dept_name', 
    `mgr_no`         INT             NULL        COMMENT 'mgr_no', 
    `dept_location`  VARCHAR(100)    NOT NULL    COMMENT 'dept_location', 
    PRIMARY KEY (dept_no)
	 */
	int dept_no, mgr_no;
	String dept_name,dept_location;
}
