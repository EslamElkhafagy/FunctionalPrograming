package com.example.functionalprograming;

import com.example.functionalprograming.service.GenericCall;
import com.example.functionalprograming.service.ServiceA;
import com.example.functionalprograming.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunctionalProgramingApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(FunctionalProgramingApplication.class, args);
//	}

	public static void main(String[] args) throws Exception {
		final GenericCall genericCall = new GenericCall();
		final ServiceA serviceA = new ServiceA();
		final ServiceB serviceB = new ServiceB();

		final String a = genericCall.executeApiCallFunction(new String("message a"), serviceA::printServiceAMessage);
		final String a2 = genericCall.executeApiCallFunction(new String("message b"), serviceB::printServiceBMessage);

	}

}
