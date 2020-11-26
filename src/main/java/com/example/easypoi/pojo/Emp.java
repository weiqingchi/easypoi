package com.example.easypoi.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
@TableName("emp")
@ExcelTarget("emp")
public class Emp implements Serializable {
    @Excel(name = "id")
    @TableId(value = "id",type = IdType.AUTO)
    private  Integer id;
    @Excel(name = "名字")
    @TableField("name")
    private String  name;
    @Excel(name = "职位")
    @TableField("job")
    private  String job;
    @Excel(name = "薪水")
    @TableField("salary")
    private  Double salary;


}
