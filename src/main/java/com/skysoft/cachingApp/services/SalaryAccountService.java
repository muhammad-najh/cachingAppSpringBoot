package com.skysoft.cachingApp.services;

import com.skysoft.cachingApp.entities.Employee;
import com.skysoft.cachingApp.entities.SalaryAccount;

public interface SalaryAccountService {
    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}
