package com.coooolbreeze.service.impl;

import com.coooolbreeze.mapper.StuMapper;
import com.coooolbreeze.pojo.Stu;
import com.coooolbreeze.service.StuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuMapper stuMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Stu getStuInfo(int id) {
        return stuMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveStu() {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateStu(int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteStu(int id) {
        // TODO Auto-generated method stub

    }

}
