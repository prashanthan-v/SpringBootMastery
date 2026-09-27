package com.selfimprovement.SpringbootMasterclass.RequestParamMasterClass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RestController
@RequestMapping("/req-param")
public class Requestparam {

    //get reqparam
    @GetMapping({"","/"})
    public String  reqparam(@RequestParam String name,@RequestParam int age){

        return name+"-"+age;
    }

    //get reqparamusing map

    @GetMapping("/map")
    public String  reqparam_using_map(@RequestParam Map<String,String>map){

        return map.get("name")+"-"+map.get("age");
    }
}
