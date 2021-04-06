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
@Table(name = "section")
public class Section {
	@Id
    @GeneratedValue
    private long id;
    
    @Column(nullable=false)
    private String sectionName;
    
    
    @ManyToOne
    @JoinColumn(name="fk_id")
    private Program program;
    
    public Section() {}

	public Section(long id, String sectionName, Program program) {
		super();
		this.id = id;
		this.sectionName = sectionName;
		this.program = program;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	

	
}
