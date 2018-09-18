/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bean.Master;

/**
 *
 * @author Mazcon
 */
public class State_Bean
{
   String state;
   String state_id;
   public String getStateId()
   {
       return state_id;
   }
   public void setStateId(String state_id)
   {
       this.state_id=state_id;
   }
   public String getState()
   {
      return state; 
   }
   public void setState(String state)
   {
      this.state=state;
   }    
}
