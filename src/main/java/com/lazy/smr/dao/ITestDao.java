package com.lazy.smr.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface ITestDao {
    Map<String,Object> getStudent()throws  Exception;
}
