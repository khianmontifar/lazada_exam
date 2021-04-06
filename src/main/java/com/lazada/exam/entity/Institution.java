package com.lazada.exam.entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "institution")
public class Institution {
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String schoolName;
    private String schoolDescription;
    
    @OneToMany(mappedBy = "institution")
    private List<College> college;
    
    public Institution()
    {
    }

    

    public Institution(Integer id, String schoolName, String schoolDescription, List<College> college) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.schoolDescription = schoolDescription;
		this.college = college;
	}



	public Integer getId()
    {  
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getSchoolName()
    {
        return schoolName;
    }

    public void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }
    
    public String getSchoolDescription()
    {
        return schoolDescription;
    }

    public void setSchoolDescription(String schoolDescription)
    {
        this.schoolDescription = schoolDescription;
    }



	public List<College> getCollege() {
		return college;
	}



	public void setCollege(List<College> college) {
		this.college = college;
	}
    
    
}
