package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "contemp2")
/*@AttributeOverrides({
  @AttributeOverride(name = "eid", column = @Column(name = "eid")),
  @AttributeOverride(name = "ename", column = @Column(name = "ename"))
})*/
//Type 3
@PrimaryKeyJoinColumn(name = "eid")
public class ContractEmployee extends Employee {
	 @Column(name = "epayperhour")
	  double payperhour;
	  
	  @Column(name = "eduration")
	  String duration;

	  public double getPayperhour() {
	    return payperhour;
	  }

	  public void setPayperhour(double payperhour) {
	    this.payperhour = payperhour;
	  }

	  public String getDuration() {
	    return duration;
	  }

	  public void setDuration(String duration) {
	    this.duration = duration;
	  }

}
