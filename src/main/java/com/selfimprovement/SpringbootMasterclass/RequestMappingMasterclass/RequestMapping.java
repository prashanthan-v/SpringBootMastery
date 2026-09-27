package com.selfimprovement.SpringbootMasterclass.RequestMappingMasterclass;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestMapping {

    //Requestmapping can be used above method and class
   // in case of method
    // can triger this method by any method get,post,put,delete
  @org.springframework.web.bind.annotation.RequestMapping(path = "/home")
    public String hitbyanymethod(){
        return "works-for-every-method";
    }

    //restrict to specific method
    @org.springframework.web.bind.annotation.RequestMapping(path = "/specificmethod",method = {RequestMethod.GET,RequestMethod.DELETE})
    public String hitbyspecificmethod(){
        return "works-for-specific-method";
    }

    //restrict what to accept ex;json and what to send

    @org.springframework.web.bind.annotation.RequestMapping(path = "/restrict_in_out",method = {RequestMethod.GET,RequestMethod.DELETE},
            consumes = "application/json",produces = "application/json")
    public String restrict_input_output(){
        return "works-for-specific-method";
    }
}
