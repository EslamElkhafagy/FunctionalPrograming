package com.example.functionalprograming.service;


import org.springframework.stereotype.Service;

@Service
public class ServiceB {

    public String printServiceBMessage(final String message){


        for (int i=0;i<1000;i++){
            System.out.print(message+" , ");
        }
        return message;
    }
}
