package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Feedback;

import com.service.FeedbackService;

@RestController
@RequestMapping("feedback")
public class FeedbackController 
{
	@Autowired
	FeedbackService feedbackService;
	
	@PostMapping(value="GeFteedback" , produces = MediaType.APPLICATION_JSON_VALUE)
	public String GetFeedback(@RequestBody Feedback feedback)
	{
		System.out.println(feedback.toString());
		return feedbackService.GiveFeedback(feedback);
	}
	
	@GetMapping(value = "getAllfeedback" , produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Feedback> getAllfeedback()
	{
		return feedbackService.findAllfeedback();
	}
}
