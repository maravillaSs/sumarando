package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Suma {
	
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  
  public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

private Integer num1;

  private Integer num2;

  private Integer num1masnum2;

	public Integer getNum1() {
		return num1;
	}
	
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	
	public Integer getNum2() {
		return num2;
	}
	
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	
	public Integer getNum1masnum2() {
		return num1masnum2;
	}
	
	public void setNum1masnum2(Integer num1masnum2) {
		this.num1masnum2 = num1masnum2;
	}

	
}