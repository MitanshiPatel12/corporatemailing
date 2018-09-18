/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bean.Master;

/**
 *
 * @author Mazcon
 */
public class City_Bean 
{
    String city;
   int city_id;
   int state_id;
   public int getCityId()
   {
       return city_id;
   }
   public void setCityId(int city_id)
   {
       this.city_id=city_id;
   }
   public String getCity()
   {
      return city; 
   }
   public void setCity(String city)
   {
      this.city=city;
   }  
   public int getStateId()
   {
        return state_id;
   }
   public void setStateId(int state_id)
   {
       this.state_id=state_id;
   }
}
