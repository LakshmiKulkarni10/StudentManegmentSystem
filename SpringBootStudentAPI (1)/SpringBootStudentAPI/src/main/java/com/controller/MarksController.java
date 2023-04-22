package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Marks;
import com.bean.Student;
import com.service.MarksService;
import com.service.StudentService;

@RestController
@RequestMapping("marks")
public class MarksController 
{
	@Autowired
	 MarksService marksService;
	
	@PostMapping(value = "storeMarks",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeMarks(@RequestBody Marks marks) {
		return marksService.storeMarks(marks);
	}
	

}
