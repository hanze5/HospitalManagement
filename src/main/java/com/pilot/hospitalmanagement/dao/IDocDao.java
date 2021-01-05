package com.pilot.hospitalmanagement.dao;

import com.pilot.hospitalmanagement.Po.Doc;

public interface IDocDao {

    int deleteByPrimaryKey(String docID);

    void insert (Doc record);

    Doc selectByPrimaryKey(String docID);

    int updateByPrimaryKeySelective(Doc record);


}
