package com.dxc.farmeasy.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {

    @Id
    private String userName;
    private String userFirstName;
    private String userLastName;
    private String userPassword;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = {
                    @JoinColumn(name = "USER_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID")
            }
    )
    private Set<Role> role;

    

    public void setUserName(String userName) {
        this.userName = userName;
    }

  

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }


    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

   
    public void setRole(Set<Role> role) {
        this.role = role;
    }

	public String getUserName() {
		 return userName;
	}

	public String getUserFirstName() {
		 return userFirstName;
	}
	
	public String getUserLastName() {
		 return userLastName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}

	public Set<Role> getRole() {
		return role;
	}

	
		public void setUserFirstName(String userFirstName) {
	        this.userFirstName = userFirstName;
	    }
		
	}



	

	
	
	


	
	
	
