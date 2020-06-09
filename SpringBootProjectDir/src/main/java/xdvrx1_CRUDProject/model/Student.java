package xdvrx1_CRUDProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	private Long id;
	private String name;
	//private String brand;
	//private String madein;
	private float roboticsGrade;

	protected Student() {
	}

	protected Student(Long id, float roboticsGrade) {
		super();
		this.id = id;
		this.name = name;
		//this.brand = brand;
		//this.madein = madein;
		this.roboticsGrade = roboticsGrade;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRoboticsGrade() {
		return roboticsGrade;
	}

	public void setRoboticsGrade(float roboticsGrade) {
		this.roboticsGrade = roboticsGrade;
	}

}