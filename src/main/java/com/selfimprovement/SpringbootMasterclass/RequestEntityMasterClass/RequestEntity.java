package com.selfimprovement.SpringbootMasterclass.RequestEntityMasterClass;

import com.selfimprovement.SpringbootMasterclass.DTO.UserDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/reqentity")
@RestController
public class RequestEntity {

    //using reqentity can  get pathvariable,requestparam,body,header

    @GetMapping("/user/{userid}")
    public String  getallreqrecords(org.springframework.http.RequestEntity<UserDTO> requestEntity){

       UserDTO userDTO= requestEntity.getBody();
      String query = requestEntity.getUrl().getQuery();
        HttpHeaders headers = requestEntity.getHeaders();
        String pathvariable =requestEntity.getUrl().getPath();

        return "reqbody-"+userDTO+" "+"queryparam-" +query+" "+"headers-"+headers+" "+"pathvariable-"+pathvariable;
    }
}
