package com.example.easypoi.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@Slf4j
@TableName("tb_order")
@ExcelTarget("order")
public class Tb_order {
    @TableId(value = "id",type = IdType.AUTO)
    @Excel(name = "id")

    private Integer id;
    @Excel(name = "door_id")
    private Integer  door_id;
    @Excel(name = "order_no")
    private String order_no;
    @Excel(name = "order_type")

    private String order_type;
    @Excel(name = "pnum")

    private Integer pnum;
    @Excel(name = "cashier")

    private String cashier;
    @Excel(name = "order_time")

    private Date order_time;
    @Excel(name = "pay_time")

    private Date pay_time;
    @Excel(name = "pay_type")

    private String pay_type;
    @Excel(name = "price")

    private Double price;


}
