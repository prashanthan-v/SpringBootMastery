package com.selfimprovement.SpringbootMasterclass.PathVariableMasterClass;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Pathvariable {

    //general use case with one path variable

    // search for specific user
//    @GetMapping("/api/users/{userid}")
//    public String searchspecificuser(@PathVariable Long userid){
//        return "userid-"+userid;
//    }

    //multile path variable

    // search for specific user and specific post
//    @GetMapping("/api/users/{userid}/posts/{postid}")
//    public String searchspecificuserans_specificpost(@PathVariable Long userid,@PathVariable Long postid){
//        return "userid-"+userid +"postid-"+postid;
//    }

    //placeholder name and parameter name has to be same so the spring can map it
    //what if we want different names

    @GetMapping("/api/users/diffname/{userid}")
    public String searchspecificuser_diffparam_name(@PathVariable (name = "userid") Long customer_id){
        return "diffnameuserid-"+customer_id;
    }

    // wanting optinal pathvariable can or cant given
  // can hit any of these endpoint to access this resource
//    @GetMapping({"/api/users/{userid}/posts/{postid}","/api/users/{userid}"})
//    public String searchspecificuserans_specificpost_optional(@PathVariable Long userid,@PathVariable (required = false) Long postid){
//        return "userid-"+userid +"postid-"+postid;
//    }

    //can use map to get multiplepathvariable

    @GetMapping("/api/users/{userId}/posts/{postId}")
    public String getPost(@PathVariable Map<String, String> pathVariables) {

        String userId = pathVariables.get("userId");
        String postId = pathVariables.get("postId");

        return userId + " " + postId;
    }

    //request param used for filtering but only added atwer pathvariable in the url

}
