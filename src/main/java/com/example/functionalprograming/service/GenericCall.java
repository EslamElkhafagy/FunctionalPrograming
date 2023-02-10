package com.example.functionalprograming.service;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class GenericCall {
    public <API_REQUEST_CLASS, API_RESPONSE_CLASS> API_RESPONSE_CLASS executeApiCallFunction(final API_REQUEST_CLASS apiRequest, final Function<API_REQUEST_CLASS, API_RESPONSE_CLASS> apiCallFunction) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        try {
            CompletableFuture<String> job = CompletableFuture.supplyAsync(() -> {
                API_RESPONSE_CLASS response = apiCallFunction.apply(apiRequest);
                System.out.println("============>> " + Thread.currentThread());
                System.out.println("Response ====>> " + response);
                System.out.println();
                return "DONE";
            }, executorService).exceptionally(throwable -> {
                System.out.println("error" + throwable.getMessage());
                return null;
            });
        } catch (final Exception throwableException) {
            System.out.println("Error " + throwableException.getMessage());
        } finally {
            System.out.println("Finally executed");
        }
        return null;
    }
}
