package com.selfimprovement.SpringbootMasterclass.PrefixpathusingWebMVCconfigurer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class Controller {

    @GetMapping
    public  String api_where_prefix_path_coming_from_webmvcconfiguree(){
        return "api_where_prefix_path_coming_from_webmvcconfigureee";
    }
}
