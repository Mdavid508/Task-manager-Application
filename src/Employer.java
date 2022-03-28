
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joseph
 */
public class Employer {
    public Map employer;
    public String firstName="Joseph";
    public String lastName;
    public String email;
    public String phone;
    
    public Employer(Map<String, String> employer){
        this.employer = employer;
    }
    
    public Map getData(){
        return this.employer;
    }
    
}
