public class Department {
    
    private String departmentName;
    private String headOfDepartment;
    private String officeRoom;
    private String email;
    private String phoneNumber;
    private double budget;
    
    private static int totalDepartments;
    private static final double UNIVERSITY_BUDGET = 1000000.0;
    
    public static int getTotalDepartments() {
        return totalDepartments;
    }
    
    public static boolean validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return email.contains("@") && email.contains(".");
    }
    
    public Department() {
        setDepartmentName("Unknown");
        setHeadOfDepartment("Unknown");
        setOfficeRoom("Unknown");
        setEmail("unknown@edu.ru");
        setPhoneNumber("0000000000");
        setBudget(0.0);
        totalDepartments++;
    }
    
    public Department(String departmentName, String headOfDepartment, String officeRoom) {
        setDepartmentName(departmentName);
        setHeadOfDepartment(headOfDepartment);
        setOfficeRoom(officeRoom);
        setEmail("unknown@edu.ru");
        setPhoneNumber("0000000000");
        setBudget(0.0);
        totalDepartments++;
    }
    
    public Department(String departmentName, String headOfDepartment, String officeRoom, 
                     String email, String phoneNumber, double budget) {
        setDepartmentName(departmentName);
        setHeadOfDepartment(headOfDepartment);
        setOfficeRoom(officeRoom);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setBudget(budget);
        totalDepartments++;
    }
    
    public String getDepartmentName() {
        return departmentName;
    }
    
    public String getHeadOfDepartment() {
        return headOfDepartment;
    }
    
    public String getOfficeRoom() {
        return officeRoom;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public double getBudget() {
        return budget;
    }
    
    public void setDepartmentName(String departmentName) {
        if (departmentName != null && departmentName.trim().isEmpty() == false) {
            this.departmentName = departmentName;
        } else {
            System.out.println("Название кафедры не может быть пустым");
            return;
        }
    }
    
    public void setHeadOfDepartment(String headOfDepartment) {
        if (headOfDepartment != null && headOfDepartment.trim().isEmpty() == false) {
            this.headOfDepartment = headOfDepartment;
        } else {
            System.out.println("Заведующий кафедрой не может быть пустым");
            return;
        }
    }
    
    public void setOfficeRoom(String officeRoom) {
        if (officeRoom != null && officeRoom.trim().isEmpty() == false) {
            this.officeRoom = officeRoom;
        } else {
            System.out.println("Номер кабинета не может быть пустым");
            return;
        }
    }
    
    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Email должен содержать @ и .");
            return;
        }
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\d+")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Телефон должен содержать только цифры");
            return;
        }
    }
    
    public void setBudget(double budget) {
        if (budget >= 0) {
            this.budget = budget;
        } else {
            System.out.println("Бюджет не может быть отрицательным");
            return;
        }
    }
    
    public void contact() {
        System.out.println("Кафедра: " + departmentName);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Кабинет: " + officeRoom);
    }
    
    public void contact(String message) {
        System.out.println("Кафедра: " + departmentName);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Кабинет: " + officeRoom);
        System.out.println("Сообщение: " + message);
    }
    
    public void allocateBudget(double amount) {
        if (amount > 0) {
            budget += amount;
            System.out.println("Выделено " + amount + " руб. Новый бюджет: " + budget + " руб.");
        } else {
            System.out.println("Сумма должна быть положительной");
            return;
        }
    }
    
    public void allocateBudget(double amount, String purpose) {
        if (amount > 0) {
            budget += amount;
            System.out.println("Выделено " + amount + " руб. на " + purpose + ". Новый бюджет: " + budget + " руб.");
        } else {
            System.out.println("Сумма должна быть положительной");
            return;
        }
    }
}