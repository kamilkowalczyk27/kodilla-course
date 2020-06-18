package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.mamytomany.dao.CompanyDao;
import com.kodilla.hibernate.mamytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private Facade facade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSearchCompanyByPart() throws FacadeException {
        Company adidas = new Company("adidas");
        companyDao.save(adidas);
        try {
            facade.getCompanyByPart("adi");
        } catch (FacadeException e) {

        }
    }

    @Test
    public void testSearchEmployeeByPart() throws FacadeException {
        Employee janKowalski = new Employee("Jan", "Kowalski");
        employeeDao.save(janKowalski);
        try {
            facade.getEmployeeByPart("ski");
        } catch (FacadeException e) {

        }
    }
}
