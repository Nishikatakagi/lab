/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import static j1.s.p0071.Validation.sc;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Task {

    private int ID;
    private String TaskTypeID;
    private String requirementName;
    private String Date;
    private double planFrom;
    private double planTo;
    private String assigneeString;
    private String reviewerString;

    public Task() {
    }

    public Task(int ID, String TaskTypeID, String requirementName, String Date, double planFrom, double planTo, String assigneeString, String reviewerString) {
        this.ID = ID;
        this.TaskTypeID = TaskTypeID;
        this.requirementName = requirementName;
        this.Date = Date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assigneeString = assigneeString;
        this.reviewerString = reviewerString;
    }

    public int getID() {
        return ID;
    }

    public String getTaskTypeID() {
        return TaskTypeID;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public String getDate() {
        return Date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public String getAssigneeString() {
        return assigneeString;
    }

    public String getReviewerString() {
        return reviewerString;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTaskTypeID(int number) {
        try {
            if (isTaskType(number)) {
                switch (number) {
                    case 1:
                        this.TaskTypeID = "Code";
                    case 2:
                        this.TaskTypeID = "Test";
                    case 3:
                        this.TaskTypeID = "Design";
                    case 4:
                        this.TaskTypeID = "Review";
                }

            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.err.println("Not correct\nEnter 1 for Code/ 2 for Test/ 3 for Design/ 4 for Review ");
            System.out.print("In-input: ");
            setTaskTypeID(Validation.intputInt("Task Type: "));
        }
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public void setDate(String Date) {
        try {
            if (isDate(Date)) {
                this.Date = Date;
            }
        } catch (ParseException e) {
            // Xử lý khi có lỗi ParseException
            System.out.println("Ngày không hợp lệ!");
            setDate(Validation.inputString("Date: "));
        }
    }

    public void setPlanFrom(double planFrom) {
        if (isNumberPlan(planFrom)) {
            this.planFrom = planFrom;
        } else {
            System.out.println("Enter from 8.0 - 17.5");
            setPlanFrom(Validation.inputDouble("From: "));
        }
    }

    public void setPlanTo(double planTo) {

        if (isNumberPlan(planTo)) {
            this.planTo = planTo;
        } else {
            System.out.println("Enter from 8.0 - 17.5");
            setPlanTo(Validation.inputDouble("From: "));
        }
    }

    public void setAssigneeString(String assigneeString) {
        this.assigneeString = assigneeString;
    }

    public void setReviewerString(String reviewerString) {
        this.reviewerString = reviewerString;
    }

    // orther method
    public void input() {
        setRequirementName(Validation.inputString("Requirement Name: "));
        setTaskTypeID(Validation.intputInt("Task Type: "));
        setDate(Validation.inputString("Date: "));
        setPlanFrom(Validation.inputDouble("From: "));
        setPlanTo(Validation.inputDouble("To: "));
        setAssigneeString(Validation.inputString("Assignee: "));
        setReviewerString(Validation.inputString("Reviewer: "));
    }

    public void display() {
        System.out.printf("%-4s%-10s%-15s%-15s%-15f%-10s%-10s", this.getID(),
                this.getRequirementName(), this.getTaskTypeID(), this.getDate(),
                this.getPlanTo() - this.getPlanFrom(), this.getAssigneeString(), this.getReviewerString());
    }

    // kiểm tra date 
    private boolean isDate(String result) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date = format.parse(result);
        if (result.equalsIgnoreCase(format.format(date))) {
            return true;
        }
        return false;
    }

    // kiểm tra type
    private boolean isNumberPlan(double number) {
        if (number >= 8.0 && number <= 17.5) {
            return true;
        }
        return false;
    }

    // kiểm tra type
    private boolean isTaskType(int number) {
        if (number >= 1 && number <= 4) {
            return true;
        } else {
            return false;
        }
    }
}
