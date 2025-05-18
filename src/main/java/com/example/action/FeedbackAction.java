package com.example.action;

import com.opensymphony.xwork2.ActionSupport;
import com.example.model.Feedback;
import com.example.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FeedbackAction extends ActionSupport {
    private Feedback feedback = new Feedback();

    public Feedback getFeedback() { return feedback; }
    public void setFeedback(Feedback feedback) { this.feedback = feedback; }

    @Override
    public String execute() {
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "INSERT INTO feedback (name, email, message) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, feedback.getName());
            stmt.setString(2, feedback.getEmail());
            stmt.setString(3, feedback.getMessage());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
        return SUCCESS;
    }
}
