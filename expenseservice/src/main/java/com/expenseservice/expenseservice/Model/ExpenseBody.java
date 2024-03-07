package com.expenseservice.expenseservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseBody {
    private int Amount;
    private String Description;
    private String Category;
}
