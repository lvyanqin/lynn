/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ThreadDemo extends Thread{
    
    public static void main(String[] args){
        System.out.println("com.lynn.controller.ThreadDemo.main()【】8888888888888888888888888888888");
        ThreadDemo thread = new ThreadDemo();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("【】44444444444444444444444444555555555555555555555555555");
        Thread thread = new Thread(new RunnableDemo());
        thread.start();
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("【】555555555555555555555555555555577777777777777777777");
    }
    
    class RunnableDemo implements Runnable{
        @Override
        public void run() {
            System.out.println("com.lynn.controller.ThreadDemo.RunnableDemo.run()【】rrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        }
        
    }
    
}
