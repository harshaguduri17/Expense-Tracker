package com.expensetracker.model;

import java.util.Date;

public class ExpenseRecord {
    long amount;
    Date expenseDate;

    public ExpenseRecord(Date expenseDate, String label, String comment, String expenseType, long amount) {
        this.expenseDate = expenseDate;
        this.label = label;
        this.comment = comment;
        this.expenseType = expenseType;
        this.amount = amount;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    String label;
    String comment;
    String expenseType;
}
