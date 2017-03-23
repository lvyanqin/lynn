package com.lynn.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class SocketTest {

    private Integer i = 1;

    @Test
    public void init() {
    }

//    @Test
    public void client() throws MalformedURLException, IOException {
        while (i < 3) {
            URL url = new URL("http://localhost:8080/index.html");
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("【】链接完毕");
            server();
            i++;
        }

    }

//    @Test
    public void server() {
        try {

            ServerSocket serverSocket = new ServerSocket(8082);
            System.out.println("等待状态。。。。");
            Socket socket = serverSocket.accept();
            System.out.println("处理中。。。。");
            InputStream is = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("处理完毕。。。。");

        } catch (Exception e) {
        }

    }

}
