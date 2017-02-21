/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Administrator
 */
public class SocketClass {

    public static void main(String[] args) throws IOException {
        InputStream is = null;
        Socket socket = null;
        OutputStream os = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("等待状态。。。。");
            socket = serverSocket.accept();
            System.out.println("处理中。。。。");
            is = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            os = socket.getOutputStream();
            os.write("【】你好".getBytes());
            System.out.println("处理完毕。。。。");
        } catch (Exception e) {
            System.out.println("报错了。。。");
        }finally{
            is.close();
            socket.close();
        }
    }

    public void client() throws IOException {
        Socket socket = new Socket("localhost", 8080);
        InputStream is = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        OutputStream os = socket.getOutputStream();
        os.write("【】你好".getBytes());
        os.close();
    }

}
