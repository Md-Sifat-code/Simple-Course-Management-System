class Course {
    private String courseCode;
    private String courseName;
    private double credits;

    public Course(String courseCode, String courseName, double credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCredits() {
        return credits;
    }


    public String toString() {
        return "Course Code: " + courseCode + ", Course Name: " + courseName + ", Credits: " + credits;
    }
}