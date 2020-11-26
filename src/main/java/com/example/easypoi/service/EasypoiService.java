package com.example.easypoi.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.easypoi.mapper.EasypoiDao;
import com.example.easypoi.mapper.EasypoiOrderDao;
import com.example.easypoi.pojo.Emp;
import com.example.easypoi.pojo.Tb_order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasypoiService {
    @Autowired
    EasypoiDao easypoiDao;
    @Autowired
    EasypoiOrderDao easypoiOrderDao;
    public List<Emp>  findAll(){
        QueryWrapper<Emp> queryWrapper=new QueryWrapper<Emp>();
        List<Emp> emps = easypoiDao.selectList(queryWrapper);
        return  emps;
    }


    public List<Tb_order> findAllOrder(){
        List<Tb_order> tb_orders = easypoiOrderDao.selectList(new QueryWrapper<Tb_order>());
        return tb_orders;
    }
}
