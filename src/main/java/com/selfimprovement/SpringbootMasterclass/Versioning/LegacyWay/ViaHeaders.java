package com.selfimprovement.SpringbootMasterclass.Versioning.LegacyWay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/versioning/header")
public class ViaHeaders {

    @GetMapping(headers = "version=1")
    public String version1(){
        return "v1 via header";
    }

    @GetMapping(headers = "version=2")
    public String version2(){
        return "v2 via header";
    }
}
