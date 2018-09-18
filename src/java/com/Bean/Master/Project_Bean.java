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
public class Project_Bean 
{
   String projectid;
   String title;
   String summary;
   String startingdate;
   String endingdate;
   String language;
   String clientname;
   String email;
   String address;
   String city;
   String state;
   String contactno;
   
   
            public String getprojectid()
            {
                return projectid;
            }
            public void setprojectid(String projectid)
            {
                this.projectid=projectid;
            }
            public String gettitle()
            {
                return title;
            }
            public void settitle(String title)
            {
                this.title=title;
            }

           public String getsummary()
            {
                return summary;
            }
            public void setsummary(String summary)
            {
                this.summary=summary;
            }

            public String getstartingdate()
            {
                return startingdate;
            }
            public void setstartingdate(String startingdate)
            {
                this.startingdate=startingdate;
            }

            public String getendingdate()
            {
                return endingdate;
            }
            public void setendingdate(String endingdate)
            {
                this.endingdate=endingdate;
            }

            public String getlanguage()
            {
                return language;
            }
            public void setlanguage(String language)
            {
                this.language=language;
            }

            public String getclientname()
            {
                 return clientname;
            }
            public void setclientname(String clientname) 
            {
                this.clientname=clientname;
            }

            public String getemail()
            {
                return email;
            }
            public void setemail(String email) 
            {
                 this.email=email;
            }

            public String getaddress()
            {
                  return address;
            }
            public void setaddress(String address) 
            {
                 this.address=address;
            }

            public String getcity()
            {
                 return city;
            }
            public void setcity(String city) 
            {
                 this.city=city;
            }

            public String getstate()
            {
                 return state;
            }
            public void setstate(String state) 
            {
                 this.state=state;
            }

            public String getcontactno()
            {
                 return contactno;
            }
            public void setcontactno(String contactno) 
            {
                 this.contactno=contactno;
            }
}
