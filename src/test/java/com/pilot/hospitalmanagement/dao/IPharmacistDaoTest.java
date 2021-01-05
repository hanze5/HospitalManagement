package com.pilot.hospitalmanagement.dao;

import com.pilot.hospitalmanagement.Po.Pharmacist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.util.Date;

@SpringBootTest
public class IPharmacistDaoTest {
    @Autowired
    IPharmacistDao pharmacistDao;

    @Test
    void Context()
    {
        Date date = new Date(1999,6,1);
        Pharmacist pharmacist1 = new Pharmacist();
        Pharmacist pharmacist2 = new Pharmacist("20174313","weiye","黄维耶","男",date,"5425025045");
        pharmacistDao.insert(pharmacist2);

    }

}
