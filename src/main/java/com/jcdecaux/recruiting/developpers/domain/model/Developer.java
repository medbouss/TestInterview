package com.jcdecaux.recruiting.developpers.domain.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name="developer")
@JsonInclude(Include.NON_NULL)
public class Developer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String firstName ;
	private String lastName ;
	private String address ;
	
	@OneToMany(mappedBy = "developer",fetch=FetchType.EAGER,cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	private Set<ProgrammingLanguage> programmingLanguage;
	
	
	
	public Developer(String firstName, String lastName, String address,
			Set<ProgrammingLanguage> programmingLanguage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.programmingLanguage = programmingLanguage;
	}


	public Developer(String firstName, String lastName,
			Set<ProgrammingLanguage> programmingLanguage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.programmingLanguage = programmingLanguage;
	}
	
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set<ProgrammingLanguage> getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(Set<ProgrammingLanguage> programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
