/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/file")
public class FileAction {
    
    private String encoding = "utf-8";
    
    public File initFile(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        File file = new File("c:\\temp\\" + sdf.format(date) + ".txt");
        return file;
    }
    
    @RequestMapping("/write.do")
    @ResponseBody
    public String wirte() throws IOException{
        File file = initFile();
        FileUtils.writeStringToFile(file, "hello world\r\n", encoding, true);
        List list = new ArrayList();
        list.add("11");
        list.add("22");
        list.add("33");
        FileUtils.writeLines(file, encoding, list, true);
        return "1";
    }
    
    @RequestMapping("/read.do")
    @ResponseBody
    public String read() throws IOException{
        File file = initFile();
        //FileUtils 读取
        String content = FileUtils.readFileToString(file, encoding);
        List<String> listStrs = FileUtils.readLines(file, encoding);
        //文件流处理
        
        return content;
    }
    
}
