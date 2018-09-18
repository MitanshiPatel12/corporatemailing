/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Bean.Master;

/**
 *
 * @author Mazcon
 */
public class Designation_Bean 
{
    
   String designation;
   int designation_id;
   public int getDesignationId()
   {
       return designation_id;
   }
   public void setDesignationId(int designation_id)
   {
       this.designation_id=designation_id;
   }
   public String getDesignation()
   {
      return designation; 
   }
   public void setDesignation(String designation)
   {
      this.designation=designation;
   } 

}
