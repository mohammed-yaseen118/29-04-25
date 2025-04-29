class Student_Course{
    String course;
    int marks;

     Student_Course(String course, int marks){
        this.course = course;
        this.marks = marks;
    }
    void display(){
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }

    
}

public class Demo2 {

    public static void main(String[] args) {
        
        Student_Course s1 = new Student_Course("DevOps", 100);
        s1.display();
        
    }

}
