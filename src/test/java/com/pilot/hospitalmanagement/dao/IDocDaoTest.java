package com.pilot.hospitalmanagement.dao;

import com.pilot.hospitalmanagement.Po.Doc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class IDocDaoTest {
    @Autowired
    IDocDao iDocDao;

    @Test
    void Context()
    {
//        Date date1 = new Date(2020,11,11,10,24,11);
//        Date date2 = new Date(2020,12,11,22,23,21);
//        Doc record = new Doc("123","牙科","牙疼", date1,date2,"未完成");
//        iDocDao.insert(record);
//
//        Date date3 = new Date(2020,11,11,10,24,11);
//        Date date4 = new Date(2020,12,11,22,23,21);
//        Doc record1 = new Doc("124","牙科","牙疼", date3,date4,"未完成");
//        iDocDao.insert(record1);
//        Doc record2 = new Doc("124","牙科keke","牙疼", date3,date4,"已完成");
//        iDocDao.deleteByPrimaryKey("123");
//        iDocDao.updateByPrimaryKeySelective(record2);
//
        System.out.print(iDocDao.selectByPrimaryKey("124"));

    }
}
