package com.selfimprovement.SpringbootMasterclass.Versioning.LegacyWay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/versioning/path-variable")
public class ViaPathVariable {

    @GetMapping("/v1")
    public String v1(){
        return "v1 via pathvariable";
    }

    @GetMapping("/v2")
    public String v2(){
        return "v2 via pathvariable";
    }
}
