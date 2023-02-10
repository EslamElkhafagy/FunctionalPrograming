package com.example.functionalprograming.service;


import org.springframework.stereotype.Service;

@Service
public class ServiceA {

    public String printServiceAMessage(final String message){

        for (int i=0;i<1000;i++){
            System.out.print(message+" , ");
        }
        return message;
    }
}
