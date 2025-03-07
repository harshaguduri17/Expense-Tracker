package com.expensetracker.controller;

import com.expensetracker.model.ExpenseRecord;
import com.expensetracker.service.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackerController {

    @Autowired
    TrackerService trackerService;

    @GetMapping("/")
    public List<ExpenseRecord> getExpenseRecords() {
        return trackerService.getExpenseRecords();
    }
}
