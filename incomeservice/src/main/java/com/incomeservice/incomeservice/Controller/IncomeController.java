package com.incomeservice.incomeservice.Controller;

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

import com.incomeservice.incomeservice.Model.Income;
import com.incomeservice.incomeservice.Model.IncomeBody;
import com.incomeservice.incomeservice.Service.IncomeService;

@RestController
@RequestMapping("/api/v1/income")
public class IncomeController {

    @Autowired
    IncomeService incomeService;
    
    @PostMapping("/add")
    public ResponseEntity<String> addIncome(@RequestBody IncomeBody incBody, Principal principal){
        
        String status = incomeService.addIncome(incBody, principal);

        return new ResponseEntity<String>(status,(status=="success")?HttpStatus.CREATED:HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/")
    public ResponseEntity<Optional<List<Income>>> getUserIncomeData(){
        return new ResponseEntity<Optional<List<Income>>>(incomeService.getUserIncomeData("utkarsh"),HttpStatus.OK);
    }
}
