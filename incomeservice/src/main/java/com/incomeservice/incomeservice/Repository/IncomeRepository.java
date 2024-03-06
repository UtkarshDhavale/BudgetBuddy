package com.incomeservice.incomeservice.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incomeservice.incomeservice.Model.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income,Integer> {
    public Optional<List<Income>> findByUsername(String username);;
}
