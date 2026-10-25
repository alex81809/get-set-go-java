class Student {
    private String name;
    private int age;
    private String studentId;
    private String schoolName;
    private String grade;
    private double marks;
    private String subject;

    Student(String studentId, String schoolName) {
        this.studentId = studentId;
        this.schoolName = schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100!");
        }
    }

    public double getMarks() {
        return marks;
    }

    public String getResult() {
        if (marks >- 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public String getPerformance() {
        if (marks >= 90) {
            return "Excellent";
        } else if (marks >= 75) {
            return "Very Good";
        } else if (marks >= 60) {
            return "Good";
        } else if (marks >= 40) {
            return "Need Improvement";
        } else {
            return "Keep Practicing";
        }
    }

    public void displayInfo() {
        System.out.println("\n========== STUDENT REPORT ==========");
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("School: " + getSchoolName());
        System.out.println("Grade: " + getGrade());
        System.out.println("Subject: " + getSubject());
        System.out.println("Marks: " + getMarks());
        System.out.println("Result: " + getResult());
        System.out.println("Performance: " + getPerformance());
        System.out.println("======================================");
    }
}

class a {
    public static void main(String[] args) {
        
        Student s1 = new Student("ST101", "Codingal School");

        s1.setName("Aashish");
        s1.setAge(15);
        s1.setGrade("10th grade");
        s1.setSubject("Computer Science");
        s1.setMarks(92.5);

        s1.displayInfo();

        Student s2 = new Student("ST102", "Codingal School");

        s2.setName("Rahul");
        s2.setAge(16);
        s2.setGrade("11th Grade");
        s2.setSubject("Mathematics");
        s2.setMarks(35);

        s2.displayInfo();

        System.out.println("\n--- Updating Student Information ---");

        s2.setMarks(78);
        s2.setAge(17);

        s2.displayInfo();

        System.out.println("\n--- Testing Validation ---");

        s1.setAge(-5);
        s1.setMarks(120);

        System.out.println("Current Age: " + s1.getAge());
        System.out.println("Current Marks: " + s1.getMarks());
    }
}
