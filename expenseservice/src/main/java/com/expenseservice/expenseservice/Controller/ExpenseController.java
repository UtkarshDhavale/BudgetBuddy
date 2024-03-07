package com.expenseservice.expenseservice.Controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expenseservice.expenseservice.Model.Expense;
import com.expenseservice.expenseservice.Model.ExpenseBody;
import com.expenseservice.expenseservice.Service.ExpenseService;

@RestController
@RequestMapping("/api/v1/expense")
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;
    
    @PostMapping("/add")
    public ResponseEntity<String> addIncome(@RequestBody ExpenseBody incBody, Principal principal){
        
        String status = expenseService.addIncome(incBody, principal);

        return new ResponseEntity<String>(status,(status=="success")?HttpStatus.CREATED:HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/")
    public ResponseEntity<Optional<List<Expense>>> getUserIncomeData(){
        return new ResponseEntity<Optional<List<Expense>>>(expenseService.getUserIncomeData("utkarsh"),HttpStatus.OK);
    }
}
