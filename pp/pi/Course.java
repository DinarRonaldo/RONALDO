public class Course {
    
    private String courseCode;
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private boolean isActive;
    
    private static int totalCourses;
    private static final int MAX_CREDITS_PER_SEMESTER = 30;
    
    public static int getTotalCourses() {
        return totalCourses;
    }
    
    public static int calculateWorkload(int credits) {
        return credits * 36;
    }
    
    public Course() {
        setCourseCode("Unknown");
        setCourseName("Unknown");
        setMaxStudents(30);
        setCurrentStudents(0);
        setIsActive(true);
        totalCourses++;
    }
    
    public Course(String courseCode, String courseName, int maxStudents) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setMaxStudents(maxStudents);
        setCurrentStudents(0);
        setIsActive(true);
        totalCourses++;
    }
    
    public Course(String courseCode, String courseName, int maxStudents, int currentStudents, boolean isActive) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setMaxStudents(maxStudents);
        setCurrentStudents(currentStudents);
        setIsActive(isActive);
        totalCourses++;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public int getMaxStudents() {
        return maxStudents;
    }
    
    public int getCurrentStudents() {
        return currentStudents;
    }
    
    public boolean getIsActive() {
        return isActive;
    }
    
    public void setCourseCode(String courseCode) {
        if (courseCode != null && courseCode.trim().isEmpty() == false) {
            this.courseCode = courseCode;
        } else {
            System.out.println("Код курса не может быть пустым или состоять из пробелов");
            return;
        }
    }
    
    public void setCourseName(String courseName) {
        if (courseName != null && courseName.trim().isEmpty() == false) {
            this.courseName = courseName;
        } else {
            System.out.println("Название курса не может быть пустым или состоять из пробелов");
            return;
        }
    }
    
    public void setMaxStudents(int maxStudents) {
        if (maxStudents > 0) {
            this.maxStudents = maxStudents;
        } else {
            System.out.println("Максимальное количество студентов должно быть больше 0");
            return;
        }
    }
    
    public void setCurrentStudents(int currentStudents) {
        if (currentStudents >= 0 && currentStudents <= maxStudents) {
            this.currentStudents = currentStudents;
        } else {
            System.out.println("Текущее количество студентов не может быть отрицательным или превышать максимальное");
            return;
        }
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    public void enrollStudent() {
        if (currentStudents < maxStudents && isActive) {
            currentStudents++;
            System.out.println("Студент записан на курс. Текущее количество: " + currentStudents);
        } else if (!isActive) {
            System.out.println("Курс неактивен, запись невозможна");
        } else {
            System.out.println("Достигнут лимит студентов на курсе");
        }
    }
    
    public void enrollStudent(String studentId) {
        if (currentStudents < maxStudents && isActive) {
            currentStudents++;
            System.out.println("Студент " + studentId + " записан на курс. Текущее количество: " + currentStudents);
        } else if (!isActive) {
            System.out.println("Курс неактивен, запись студента " + studentId + " невозможна");
        } else {
            System.out.println("Достигнут лимит студентов на курсе для студента " + studentId);
        }
    }
    
    public void displayInfo() {
        System.out.println("Код курса: " + courseCode);
        System.out.println("Название курса: " + courseName);
        System.out.println("Статус: " + (isActive ? "Активен" : "Неактивен"));
    }
    
    public void displayInfo(boolean showAvailability) {
        if (showAvailability) {
            System.out.println("Код курса: " + courseCode);
            System.out.println("Название курса: " + courseName);
            System.out.println("Максимальное количество студентов: " + maxStudents);
            System.out.println("Текущее количество студентов: " + currentStudents);
            System.out.println("Свободных мест: " + (maxStudents - currentStudents));
            System.out.println("Статус: " + (isActive ? "Активен" : "Неактивен"));
        } else {
            displayInfo();
        }
    }
}