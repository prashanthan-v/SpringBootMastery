package com.selfimprovement.SpringbootMasterclass.RequestHeaderMasterclass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("/reqheader")
@RestController
public class RequestHeader {

    @GetMapping("/getheaderdata")
    public String getheaderinfo(@org.springframework.web.bind.annotation.RequestHeader(name = "country",required = false,defaultValue = "US") String Nation){
        return "the user country is "+Nation;
    }
    //multiple headers using map
    @GetMapping("/getmultipleheaderdata")
    public String getmultipleheaderinfo(@org.springframework.web.bind.annotation.RequestHeader Map<String,String>headers){
        return "the user country is "+headers.get("country");
    }
}
