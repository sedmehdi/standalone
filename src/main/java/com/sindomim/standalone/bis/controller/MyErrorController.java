package com.sindomim.standalone.bis.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;

@RestController
public class MyErrorController implements ErrorController {

    @RequestMapping(path = "/error", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        Object exception = request.getAttribute(RequestDispatcher.ERROR_EXCEPTION);
        Object errorMessage = request.getAttribute(RequestDispatcher.ERROR_MESSAGE);

        return MessageFormat.format("status: {0}, message:{1}", status, errorMessage);
    }

}