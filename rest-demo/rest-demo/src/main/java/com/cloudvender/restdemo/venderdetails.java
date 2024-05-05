package com.cloudvender.restdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vender_info")
public class venderdetails {
    @Id
    private String venderId;
    private String venderName;
    private String venderCity;
    private String venderPlanDuration;
    public venderdetails() {
        
    }
    public venderdetails(String venderId, String venderName, String venderCity, String venderPlanDuration) {
        this.venderId = venderId;
        this.venderName = venderName;
        this.venderCity = venderCity;
        this.venderPlanDuration = venderPlanDuration;
    }
    public String getVenderId() {
        return venderId;
    }
    public void setVenderId(String venderId) {
        this.venderId = venderId;
    }
    public String getVenderName() {
        return venderName;
    }
    public void setVenderName(String venderName) {
        this.venderName = venderName;
    }
    public String getVenderCity() {
        return venderCity;
    }
    public void setVenderCity(String venderCity) {
        this.venderCity = venderCity;
    }
    public String getVenderPlanDuration() {
        return venderPlanDuration;
    }
    public void setVenderPlanDuration(String venderPlanDuration) {
        this.venderPlanDuration = venderPlanDuration;
    }

    
}
