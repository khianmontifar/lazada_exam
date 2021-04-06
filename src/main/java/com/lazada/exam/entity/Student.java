package com.lazada.exam.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
    @GeneratedValue
    private int id;
    
    @Column(nullable=false)
    private String lastName;
    
    @Column(nullable=false)
    private String firstName;
    
    @ManyToOne
    @JoinColumn(name="fk_id")
    private Program program;
    
    public Student() {}

	public Student(int id, String lastName, String firstName, Program program) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.program = program;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	

	
}
