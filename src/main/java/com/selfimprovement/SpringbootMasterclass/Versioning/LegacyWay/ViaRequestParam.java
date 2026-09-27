package com.selfimprovement.SpringbootMasterclass.Versioning.LegacyWay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.Param;

@RestController
@RequestMapping("/api/versioning/req-param")
public class ViaRequestParam {

 // ex url  /api/versioning/req-param?version=1
    @GetMapping(params = "version=1")
    public String version1(){
   return "v1 via param";
    }

    @GetMapping(params = "version=2")
    public String version2(){
        return "v2 via param";
    }
}
