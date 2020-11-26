package com.example.easypoi.controller;


import com.baomidou.mybatisplus.annotation.TableField;
import com.example.easypoi.pojo.Emp;
import com.example.easypoi.pojo.Tb_order;
import com.example.easypoi.service.EasypoiService;
import com.example.easypoi.utils.ExportExecl;
import com.fasterxml.jackson.core.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/easy")
public class EasypoiTest {

    @Autowired
    EasypoiService easypoiService;

    @RequestMapping("/export")
    public String exportTest(){
        System.out.println("111");
        try {
            List<Emp> all = easypoiService.findAll();
//            List<Tb_order> allOrder = easypoiService.findAllOrder();
//            System.out.println(allOrder);
            ExportExecl.exportExecl(all);
        } catch (Exception e) {
            e.printStackTrace();
            return "导出失败";
        }
        return  "导出成功";
    }
    @RequestMapping("import")
    public String importTest(){
        System.out.println("111");
        try {
            ExportExecl.importExecl();
        } catch (Exception e) {
            e.printStackTrace();
            return "导出失败";
        }
        return  "导出成功";
    }
}
