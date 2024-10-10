package com.feedback.componente_feedback.controller;

import com.feedback.componente_feedback.domain.Feedback;
import com.feedback.componente_feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
@CrossOrigin(origins = "http://localhost:4200")
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping("/novo")
    public Feedback createFeedback(@RequestBody Feedback feedback) {
        System.out.println("Feedback: " + feedback);
        return feedbackRepository.save(feedback);
    }

    @GetMapping("/todos")
    public List<Feedback> getFeedbacks() {
        return feedbackRepository.findAll();
    }
}
