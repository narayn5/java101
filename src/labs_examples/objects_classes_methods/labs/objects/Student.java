//Please demonstrate Object association by creating at least two POJOs and a Controller class. The Controller
//class will contain the main() method. In the main() create an object of each POJO you just created and associate
//the two together. (This is easier than it sounds. Refer to the Object Association documentation if you're not sure.)

package labs_examples.objects_classes_methods.labs.objects;

public class Student {
    public static void main(String[] args) {
        studentDetails kev = new studentDetails(34,"Kevin");
        courseDetails bio101 = new courseDetails(101, "intro to bio", "Kevin");
        System.out.println("Student "+kev.name+" with the id "+kev.id+" is taking the course "+bio101.courseName);
    }
}

class studentDetails {
    protected int id;
    protected String name;
    public studentDetails(int studentId, String studentName){
        this.id = studentId;
        this.name = studentName;
    }
    public void setStudentDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getSudentId(){
        return id;
    }
    public String getStudentName(){
        return name;
    }

}

class courseDetails {
    protected int courseId;
    protected String courseName;
    protected String studentName;
    public courseDetails(int cid, String cname, String sname){
        this.courseId = cid;
        this.courseName = cname;
        this.studentName = sname;
    }
    public void setCourseDetails(int cid, String cname, String sname) {
        this.courseId = cid;
        this.courseName = cname;
        this.studentName = sname;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getStudentName(){
        return studentName;
    }
}


