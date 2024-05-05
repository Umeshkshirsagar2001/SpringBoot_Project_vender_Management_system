package com.cloudvender.restdemo;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class venderimplement implements venderservice {
     venderrepo repo;
     
    public venderimplement(venderrepo repo) {
        this.repo = repo;
    }

    @Override
    public String createvender(venderdetails details) {
        repo.save(details);
        return "success";
    }

    @Override
    public String updatevender(venderdetails details) {
        repo.save(details);
        return"success";
    }

    @Override
    public String getvender(String venderId) {
        // Retrieve venderdetails by venderId
        venderdetails details = repo.findById(venderId).orElse(null);
        if (details != null) {
            // Return venderdetails information
           
            return "Vender_ID: " + details.getVenderId() + ", Vender_Name: " + details.getVenderName() + ", Vender_Location: " + details.getVenderCity() + ", venderPlanDuration: " + details.getVenderPlanDuration();
        } else {
            // Return message if venderdetails with given venderId is not found
            return "Vender not found";
        }
    }
    @Override
    public String deletevender(String venderId) {
        repo.deleteById(venderId);
        return "success";
    }

    @Override
    public List<venderdetails> getallvenderdetails() {
        return repo.findAll();
    }
    
}
