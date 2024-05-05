package com.cloudvender.restdemo;
import java.util.List;
public interface venderservice {
    public String createvender(venderdetails details);
    public String updatevender(venderdetails details);
    public String  getvender(String venderId);
    public String deletevender(String venderId);
    public List<venderdetails> getallvenderdetails();
}
