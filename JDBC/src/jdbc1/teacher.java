package jdbc1;

public class teacher {
    private int teacherId;
	private String  teachername;
	private String  teacherphone;
	private String  teachersubject;
	 //getter-setter
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getTeacherphone() {
		return teacherphone;
	}
	public void setTeacherphone(String teacherphone) {
		this.teacherphone = teacherphone;
	}
	public String getTeachersubject() {
		return teachersubject;
	}
	public void setTeachersubject(String teachersubject) {
		this.teachersubject = teachersubject;
	}
	//constructor
	public teacher(int teacherId, String teachername, String teacherphone, String teachersubject) {
		super();
		this.teacherId = teacherId;
		this.teachername = teachername;
		this.teacherphone = teacherphone;
		this.teachersubject = teachersubject;
	}
	public teacher(String teachername, String teacherphone, String teachersubject) {
		super();
		this.teachername = teachername;
		this.teacherphone = teacherphone;
		this.teachersubject = teachersubject;
	}
	
	public teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "teacher [teacherId=" + teacherId + ", teachername=" + teachername + ", teacherphone=" + teacherphone
				+ ", teachersubject=" + teachersubject + "]";
	}
	
	
	
	
	
	
}