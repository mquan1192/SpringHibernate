package model.polo;
// Generated Jun 16, 2017 3:01:29 PM by Hibernate Tools 4.3.1



/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private Integer iduser;
     private String userName;
     private String userPass;

    public Users() {
    }

    public Users(String userName, String userPass) {
       this.userName = userName;
       this.userPass = userPass;
    }
   
    public Integer getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPass() {
        return this.userPass;
    }
    
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }




}


