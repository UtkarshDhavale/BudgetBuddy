package com.expenseservice.expenseservice.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expenseservice.expenseservice.Model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Integer> {
    public Optional<List<Expense>> findByUsername(String username);;
}
