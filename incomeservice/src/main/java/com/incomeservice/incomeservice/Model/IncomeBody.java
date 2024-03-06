package com.incomeservice.incomeservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncomeBody {
    private int Amount;
    private String Description;
    private String Category;
}
