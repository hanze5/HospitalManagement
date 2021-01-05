package com.pilot.hospitalmanagement.dao;

import com.pilot.hospitalmanagement.Po.Doc;
import com.pilot.hospitalmanagement.Po.Pharmacist;

public interface IPharmacistDao {
    int deleteByPrimaryKey(String phaID);  //按ID删除配药师

    void insert (Pharmacist record);      //添加配药师

    Doc selectByPrimaryKey(String docID); //按逐渐查询配药师

    int updateByPrimaryKeySelective(Doc record); //更新配药师
}
