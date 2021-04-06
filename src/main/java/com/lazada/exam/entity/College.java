package com.lazada.exam.entity;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "college")
public class College {
	@Id
    @GeneratedValue
    private long id;
    
    @Column(nullable=false)
    private String collegeCode;
    
    @Column(nullable=false)
    private String collegeName;
    
    @ManyToOne
    @JoinColumn(name="fk_id")
    private Institution institution;
    
    @OneToMany(mappedBy = "college")
    private List<Program> program;
    
    public College() {}

	

	public College(long id, String collegeCode, String collegeName, Institution institution, List<Program> program) {
		super();
		this.id = id;
		this.collegeCode = collegeCode;
		this.collegeName = collegeName;
		this.institution = institution;
		this.program = program;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}



	public List<Program> getProgram() {
		return program;
	}



	public void setProgram(List<Program> program) {
		this.program = program;
	}

	
	

	
    
   
}
