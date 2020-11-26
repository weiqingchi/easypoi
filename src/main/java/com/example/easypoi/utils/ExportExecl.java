package com.example.easypoi.utils;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.example.easypoi.pojo.Emp;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.util.List;

@Slf4j
public class ExportExecl {
    public static void exportExecl(List<Emp> emps){

            Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("员工信息列表", "员工信息"), Emp.class, emps);

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\Tedu\\Desktop\\yuangon.xls"));
                workbook.write(fileOutputStream);

                workbook.close();
                fileOutputStream.close();
            } catch (IOException e) {
        }
    }

    public static void importExecl() throws Exception {
        ImportParams importParams=new ImportParams();
        importParams.setHeadRows(2);
        importParams.setTitleRows(1);
        List<Emp> emps = ExcelImportUtil.importExcel(new FileInputStream(new File("C:\\Users\\Tedu\\Desktop\\yuangon.xls")), Emp.class, importParams);
        System.out.println(emps);

        emps.forEach(obj->{
            System.out.println(obj);
        });
    }

}
