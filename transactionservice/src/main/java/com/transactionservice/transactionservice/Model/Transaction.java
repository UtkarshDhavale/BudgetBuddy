package com.transactionservice.transactionservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private int id;
    private String datetime;
    private int amount;
    private String description;
    private String category;
    private String username;
}
