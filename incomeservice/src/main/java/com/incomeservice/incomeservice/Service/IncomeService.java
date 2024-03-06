package com.incomeservice.incomeservice.Service;

import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incomeservice.incomeservice.Model.Income;
import com.incomeservice.incomeservice.Model.IncomeBody;
import com.incomeservice.incomeservice.Repository.IncomeRepository;

@Service
public class IncomeService {

    @Autowired
    IncomeRepository incomeRepository;

    public String addIncome(IncomeBody incBody, Principal principal){

        Income inc = new Income();
        inc.setAmount(incBody.getAmount());
        inc.setCategory(incBody.getCategory());
        inc.setDescription(incBody.getDescription());
        inc.setDatetime((new Date()).toString());
        inc.setUsername("utkarsh");

        try{
            incomeRepository.save(inc);
        }catch(Exception e){
            return "Failed. Exception Occurred: "+e;
        }

        return "success";

    }
    
    public Optional<List<Income>> getUserIncomeData(String username){
        return incomeRepository.findByUsername(username);
    }
    

}
