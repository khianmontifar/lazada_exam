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
@Table(name = "program")
public class Program {
	@Id
    @GeneratedValue
    private int id;
    
    @Column(nullable=false)
    private String programCode;
    
    @Column(nullable=false)
    private String programName;
    
    @ManyToOne
    @JoinColumn(name="fk_id")
    private College college;
    
    @OneToMany(mappedBy = "program")
    private List<Student> student;
    
    @OneToMany(mappedBy = "program")
    private List<Section> section;
    
    public Program() {}

	

	public Program(int id, String programCode, String programName, College college, List<Student> student,
			List<Section> section) {
		super();
		this.id = id;
		this.programCode = programCode;
		this.programName = programName;
		this.college = college;
		this.student = student;
		this.section = section;
	}



	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgramCode() {
		return programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Section> getSection() {
		return section;
	}

	public void setSection(List<Section> section) {
		this.section = section;
	}

	
}
