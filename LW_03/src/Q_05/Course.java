package Q_05;

public class Course {
    private String courseName;
    private String courseCode;
    private Lecture lectureIncharge;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecture getLectureIncharge() {
        return lectureIncharge;
    }

    public void setLectureIncharge(Lecture lectureIncharge) {
        this.lectureIncharge = lectureIncharge;
    }
}
