public class Student {
	
	private String studentId;
	private String firstName;
	private String lastName;
	private int age;
	private double averageGrade;
	private String faculty;
	
	private static int totalStudents;
	private static final String UNIVERSITY_NAME = "KFU ITIS";
	
	public static int getTotalStudents() {
		return totalStudents;
	}
	
	public Student() {
		setStudentId("Unknown");
		setFirstName("Unknown");
		setLastName("Unknown");
		setAge(16);
		setAverageGrade(0.0);
		setFaculty("Unknown");
		totalStudents++;
	}
	
	public Student(String studentId, String firstName, String faculty) {
		setStudentId(studentId);
		setFirstName(firstName);
		setLastName("Unknown");
		setAge(16);
		setAverageGrade(0.0);
		setFaculty(faculty);
		totalStudents++;
	}
	
	public Student(String studentId, String firstName, String lastName, int age, double averageGrade, String faculty) {
		setStudentId(studentId);
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAverageGrade(averageGrade);
		setFaculty(faculty);
		totalStudents++;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getAverageGrade() {
		return averageGrade;
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setStudentId(String studentId) {
		if (studentId != null && studentId.trim().isEmpty() == false) {
			this.studentId = studentId;
		} else {
			System.out.println("ID Студента не может быть пустым или состоять из пробелов");
			return;
		}
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		if (age >= 16 && age <= 70) {
			this.age = age;
		} else {
			System.out.println("Возраст должен быть от 16 до 70");
			return;
		}
	}
	
	public void setAverageGrade(double averageGrade) {
		if (averageGrade >= 0.0 && averageGrade <= 5.0) {
			this.averageGrade = averageGrade;
		} else {
			System.out.println("Средняя оценка должна быть от 0.0 до 5.0");
			return;
		}
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public void displayInfo() {
		System.out.println("Учебное заведение: " + 	UNIVERSITY_NAME);
		System.out.println("ID Студента: " + studentId);
		System.out.println("Имя студента: " + firstName);
		System.out.println("Факультет: " + faculty);
	}
	
	public void displayInfo(boolean detailed) {
		if (detailed == true) {
			System.out.println("Учебное заведение: " + 	UNIVERSITY_NAME);
			System.out.println("ID Студента: " + studentId);
			System.out.println("Имя студента: " + firstName);
			System.out.println("Фамилия студента: " + lastName);
			System.out.println("Возраст студента: " + age);
			System.out.println("Средняя оценка: " + averageGrade);
			System.out.println("Факультет: " + faculty);
		} else {
			displayInfo();
		}
	}
	
	public void updateGrade(double newGrade) {
		setAverageGrade(newGrade);
		System.out.println("Новая средняя оценка: " + newGrade);
	}
	
	public void updateGrade(double newGrade, String subject) {
		setAverageGrade(newGrade);
		System.out.println("Новая средняя оценка (предмет: " + subject + "): " + newGrade);
	}
}