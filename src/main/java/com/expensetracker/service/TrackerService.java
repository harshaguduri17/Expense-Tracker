package com.expensetracker.service;

import com.expensetracker.model.ExpenseRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TrackerService {
    public List<ExpenseRecord> getExpenseRecords() {
        var record1 = new ExpenseRecord( 100, new Date(2025, 3, 7), "Food", "TEST COMMENT", "Debit");
        List<ExpenseRecord> recordList = new ArrayList<>();
        recordList.add(record1);
        return recordList;
    }
}
