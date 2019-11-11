/*
 * Copyright (c) 2019 Banking Software Company s.r.o.
 */

package controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ejb.remote.RemoteEJBTest;

@RestController
public class TestController {

    @Autowired
    private RemoteEJBTest remoteEJBTest;

    @RequestMapping("/test-ejb")
    @ResponseBody
    @Transactional
    public String testEjb(
            @RequestParam(name = "input", defaultValue = "defaultValue") final String input) {
        final String result = remoteEJBTest.callMe(input);
        return "EJB called, output: " + result;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String testEjb() {
        return "controller called";
    }

}
