package com.selfimprovement.SpringbootMasterclass.Versioning.Currentmethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version-config/header")
public class ViaHeader {
    @GetMapping(version = "v1")
    public String version1(){
        return "v1 via Header-curerentversionmanager";
    }

    @GetMapping(version = "v2")
    public String version2(){
        return "v2 via Header-curerentversionmanager";
    }
}
