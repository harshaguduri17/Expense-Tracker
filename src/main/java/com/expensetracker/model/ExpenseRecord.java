package com.expensetracker.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Data
public class ExpenseRecord {
    long amount;
    Date expenseDate;
    String label;
    String comment;
    String expenseType;
}
