package com.cloudvender.restdemo;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venderdetails")
public class vendercontroller {
 venderservice service;

public vendercontroller(venderservice service) {
    this.service = service;
}

@GetMapping("{venderID}")//read data for a id from db
    public String getvenderdetails( @PathVariable("venderID")String venderID){
        return service.getvender(venderID);  
          
    }
    @GetMapping//reading all the datas from db
    public List<venderdetails> getallvenderdetails(){
        return service.getallvenderdetails();    
    }
    @PostMapping
    public String createvender(@RequestBody venderdetails vender){
         service.createvender(vender);
         return "****New Cloud vender created successfully****";
    }
    @PutMapping
    public String updatevenderdetails(@RequestBody venderdetails vender){
        service.updatevender(vender);
        return"****Cloud vender's Details updated scuccessfully****";
    }
    @DeleteMapping("{venderID}")
    public String deletevenderdetails(@PathVariable("venderID") String venderID){
         service.deletevender(venderID);
         return "****Vender Details deleted success****";
    }
 
}
