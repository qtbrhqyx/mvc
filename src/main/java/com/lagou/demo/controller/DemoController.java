package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Security({"luoxia"})
@LagouController
@LagouRequestMapping("/demo")
public class DemoController {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param name
     * @return
     */
    @Security({"luojun"})
    @LagouRequestMapping("/query")
    public String query(HttpServletRequest request, HttpServletResponse response,String name) {
        return demoService.get(name);
    }


    @Security({"luo"})
    @LagouRequestMapping("/save")
    public String save(HttpServletRequest request, HttpServletResponse response,String name) {
        return "jun";
    }

    @Security({"jun"})
    @LagouRequestMapping("/insert")
    public String insert(HttpServletRequest request, HttpServletResponse response,String name) {
        return "jun";
    }

}
