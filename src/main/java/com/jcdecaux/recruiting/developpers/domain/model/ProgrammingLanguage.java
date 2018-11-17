package com.jcdecaux.recruiting.developpers.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class ProgrammingLanguage  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id ;
	
	@Column(unique=true)
	private String languageName ;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id")
	@JsonIgnore
	private Developer developer ;
	
	

	public ProgrammingLanguage(String languageName, Developer developer) {
		super();
		this.languageName = languageName;
		this.developer = developer;
	}
	


	public ProgrammingLanguage() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLanguageName() {
		return languageName;
	}


	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}


	public Developer getDeveloper() {
		return developer;
	}


	public void setDeveloper(Developer developer) {
		this.developer = developer;
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
		ProgrammingLanguage other = (ProgrammingLanguage) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
