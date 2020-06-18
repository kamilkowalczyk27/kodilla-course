package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.mamytomany.dao.CompanyDao;
import com.kodilla.hibernate.mamytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Facade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> getCompanyByPart(String partName) throws FacadeException {
        List<Company> companies = companyDao.searchCompanyByPart(partName);
        LOGGER.info("Searching a company with letters: " + partName);
        if (companies.size() <= 0) {
            LOGGER.error(FacadeException.ERR_COMPANY_NOT_FOUND);
            throw new FacadeException(FacadeException.ERR_COMPANY_NOT_FOUND);
        }
        LOGGER.info("Company was found. " + companies);
        return companies;
    }

    public List<Employee> getEmployeeByPart(String lastname) throws FacadeException {
        List<Employee> employees = employeeDao.searchEmployeeByPart(lastname);
        LOGGER.info("Searching a employee with letters " + lastname);
        if (employees.size() <= 0) {
            LOGGER.error(FacadeException.ERR_EMPLOYEE_NOT_FOUND);
            throw new FacadeException(FacadeException.ERR_EMPLOYEE_NOT_FOUND);
        }
        LOGGER.info("Employee was found. " + employees);
        return employees;
    }
}
