package com.transactionservice.transactionservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {
    
    @GetMapping("/totalexpense")
    public String totalExpense(){
        return "Total Expense";
    }

    @GetMapping("/totalincome")
    public String totalIncome(){
        return "Total Income";
    }

    @GetMapping("/categorywise")
    public String categorywiseFilter(){
        return "Categorywise Income/Expense";
    }

    @PostMapping("/datewise")
    public String datewiseFilter(){
        return "Datewise Filter";
    }
    
}
