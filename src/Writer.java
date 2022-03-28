
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joseph
 */
public class Writer {
    public Map writer;
    public Writer(Map<String, String> writer){
        this.writer = writer;
    }
   
    public Map getData(){
        return this.writer;
    }
    
}
