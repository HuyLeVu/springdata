package vn.smartdev.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name= "user")
public class User {
	@Id
	@Column(name= "username")
	private String userName;
	
	@Column(name = "password" )
	private String passWord;
	
	/*@OneToMany(fetch = FetchType.EAGER,mappedBy = "user")
	private List<Project> project;*/
	
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="user")
	private Set<Business> businesses;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="user")
	private Set<Location> locations;
	
	@OneToOne(mappedBy="user")
	private Profile profile;

	public String getUserName() {
		return userName;
	}

	
	public Set<Business> getBusinesses() {
		return businesses;
	}


	public void setBusinesses(Set<Business> businesses) {
		this.businesses = businesses;
	}


	public Set<Location> getLocations() {
		return locations;
	}


	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public User(String userName, String passWord, Set<Business> businesses, Set<Location> locations,
			Profile profile) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.businesses = businesses;
		this.locations = locations;
		this.profile = profile;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
}
