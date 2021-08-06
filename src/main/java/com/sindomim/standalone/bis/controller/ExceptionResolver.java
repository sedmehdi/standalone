package com.sindomim.standalone.bis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

//@RestControllerAdvice
public class ExceptionResolver {

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public HashMap<String, String> handleNoHandlerFound(NoHandlerFoundException e, WebRequest request1) {
        HttpServletRequest request = (HttpServletRequest) request1;
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
        HashMap<String, String> response = new HashMap<>();
        response.put("status", "" + statusCode);
        response.put("message", exception.getMessage());
        return response;
    }
}