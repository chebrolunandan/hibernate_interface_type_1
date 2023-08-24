package com.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "regemp2")
/*@AttributeOverrides({
  @AttributeOverride(name = "eid", column = @Column(name = "eid")),
  @AttributeOverride(name = "ename", column = @Column(name = "ename"))
})*/
//Type 3
@PrimaryKeyJoinColumn(name = "eid")
public class RegularEmployee extends Employee{
	 @Column(name = "esalary")
	  double salary;
	  
	  @Column(name = "ebonus")
	  int bonus;

	  public double getSalary() {
	    return salary;
	  }

	  public void setSalary(double salary) {
	    this.salary = salary;
	  }

	  public int getBonus() {
	    return bonus;
	  }

	  public void setBonus(int bonus) {
	    this.bonus = bonus;
	  }

}
