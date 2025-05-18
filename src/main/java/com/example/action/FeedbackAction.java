package com.example.action;

import com.opensymphony.xwork2.ActionSupport;
import com.example.model.Feedback;

public class FeedbackAction extends ActionSupport {

    private Feedback feedback = new Feedback();

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    @Override
    public String execute() {
        String name = this.feedback.getName();
        System.out.println(name+"name is this ?");
        // You can add saving logic here later
        return SUCCESS;
    }
}
