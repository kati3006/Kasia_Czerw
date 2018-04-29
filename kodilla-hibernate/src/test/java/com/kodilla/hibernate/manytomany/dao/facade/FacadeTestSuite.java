package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.Facade;
import com.kodilla.hibernate.manytomany.facade.NotFoundException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void findCompany() throws NotFoundException {
        //Given
        Company company1 = new Company("Software Machine");
        Company company2 = new Company("Data Maesters");
        Company company3 = new Company("Grey Matter");

        //When
        companyDao.save(company1);
        int company1Id = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();
        companyDao.save(company3);
        int company3Id = company3.getId();

        List<Company> findCompany = facade.findCompany("sof");

        //Then
        Assert.assertNotEquals(0, company1Id);
        Assert.assertNotEquals(0, company2Id);
        Assert.assertNotEquals(0, company3Id);
        Assert.assertEquals(0, findCompany.size());

        try {
            companyDao.delete(company1Id);
            companyDao.delete(company2Id);
            companyDao.delete(company3Id);
        } catch (Exception e) {
            //
        }
    }

    @Test
    public void findEmployee() throws NotFoundException {
        //Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Stephanie", "Clarckson");
        Employee employee3 = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(employee1);
        int employee1Id = employee1.getId();
        employeeDao.save(employee2);
        int employee2Id = employee2.getId();
        employeeDao.save(employee3);
        int employee3Id = employee3.getId();

        List<Employee> findEmployee = facade.findEmployee("John");

        //Then
        Assert.assertNotEquals(0, employee1Id);
        Assert.assertNotEquals(0, employee2Id);
        Assert.assertNotEquals(0, employee3Id);
        Assert.assertEquals(0, findEmployee.size());

        try {
            employeeDao.delete(employee1Id);
            employeeDao.delete(employee2Id);
            employeeDao.delete(employee3Id);
        } catch (Exception e) {
            //
        }
    }
}
