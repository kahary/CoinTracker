/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointracker.entities;

/*
 *
 * @author comp8
 */
public class Category {
    private int id;
    private String description;
    private String type;
    
   
    public int getId(){
         return id;
    }
    public void setId(int id){
         this.id = id;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    

}
