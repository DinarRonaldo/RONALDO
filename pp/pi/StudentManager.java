public class StudentManager {
	
    private Student[] students;
    private Course[] courses;
    private int studentCount;
    private int courseCount;
    
    public StudentManager() {
        this.students = new Student[100];
        this.courses = new Course[50];
        this.studentCount = 0;
        this.courseCount = 0;
    }
    
    public void addStudentToCourse(Student student, Course course) {
        if (student == null || course == null) {
            System.out.println("Студент или курс не могут быть null");
            return;
        }
        
        boolean studentExists = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId().equals(student.getStudentId())) {
                studentExists = true;
                break;
            }
        }
        
        if (!studentExists && studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        }
        
        course.enrollStudent(student.getStudentId());
        System.out.println("Студент " + student.getStudentId() + " записан на курс " + course.getCourseCode());
    }
    
    public Student findStudentById(String studentId) {
        if (studentId == null || studentId.trim().isEmpty()) {
            System.out.println("ID студента не может быть пустым");
            return null;
        }
        
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId().equals(studentId)) {
                return students[i];
            }
        }
        
        System.out.println("Студент с ID " + studentId + " не найден");
        return null;
    }
    
    public Student[] getStudentsByFaculty(String faculty) {
        if (faculty == null || faculty.trim().isEmpty()) {
            System.out.println("Факультет не может быть пустым");
            return new Student[0];
        }
        
        int count = 0;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                count++;
            }
        }
        
        Student[] facultyStudents = new Student[count];
        int index = 0;
        
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                facultyStudents[index] = students[i];
                index++;
            }
        }
        
        return facultyStudents;
    }
    
    public double calculateFacultyAverage(String faculty) {
        if (faculty == null || faculty.trim().isEmpty()) {
            System.out.println("Факультет не может быть пустым");
            return 0.0;
        }
        
        double sum = 0.0;
        int count = 0;
        
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                sum += students[i].getAverageGrade();
                count++;
            }
        }
        
        if (count > 0) {
            return sum / count;
        } else {
            System.out.println("На факультете " + faculty + " нет студентов");
            return 0.0;
        }
    }
}