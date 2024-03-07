package com.expenseservice.expenseservice.Service;

import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenseservice.expenseservice.Model.Expense;
import com.expenseservice.expenseservice.Model.ExpenseBody;
import com.expenseservice.expenseservice.Repository.ExpenseRepository;

@Service
public class ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    public String addIncome(ExpenseBody expBody, Principal principal){

        Expense inc = new Expense();
        inc.setAmount(expBody.getAmount());
        inc.setCategory(expBody.getCategory());
        inc.setDescription(expBody.getDescription());
        inc.setDatetime((new Date()).toString());
        inc.setUsername("utkarsh");

        try{
            expenseRepository.save(inc);
        }catch(Exception e){
            return "Failed. Exception Occurred: "+e;
        }

        return "success";

    }
    
    public Optional<List<Expense>> getUserIncomeData(String username){
        return expenseRepository.findByUsername(username);
    }
    

}
