package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "barchartValue")
public class BarchartValue {
	@Id
    @GeneratedValue
    private long id;
	
	// Definition of data fields for the x and y values

	@Column(name = "wertx")
    private Integer Wertx;
	
	@Column(name = "werty")
    private Integer Werty;
    
    
    public BarchartValue() {
    
    }
    // Constructor to initialize data fields for x and y values

	public BarchartValue(Integer wertx, Integer werty) {
		super();
		this.Wertx = wertx;
		this.Werty = werty;
	}
	// Getter and setter methods for the data fields

	public Integer getWertx() {
		return Wertx;
	}
	public void setWertx(Integer wertx) {
		Wertx = wertx;
	}
	public Integer getWerty() {
		return Werty;
	}
	public void setWerty(Integer werty) {
		Werty = werty;
	}
	// Getter method for the Id
	public long getId() {
		return id;
	}
	
}
