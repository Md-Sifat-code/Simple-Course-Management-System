public class Department {
    public String Department_name;
    public Course[] courses;
    public Department(String Department_name,Course[] courses){
        this.courses = courses;
        this.Department_name = Department_name;

    }
    public void displayCourses(){
        System.out.println("Department Name: "+Department_name);
        for(Course course1 : courses){
            System.out.println(course1);
        }
    }
}
