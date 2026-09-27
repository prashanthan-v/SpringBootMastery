package com.selfimprovement.SpringbootMasterclass.ResponseEntityMasterClass;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response-entity")
public class ResponseEntity {

//    server->client
    //had to send the response using this comprise of
    // Status code,
    // header(metadata baoput response ex:content type),
    // response body (actual data)


    @GetMapping
      public org.springframework.http.ResponseEntity<String> sendresponse_using_resentity(){
          return org.springframework.http.ResponseEntity.status(HttpStatus.CREATED) //this is enum
                  .header("content-type","text/plain")
                  .body("User Created Succefully");
      }


}
