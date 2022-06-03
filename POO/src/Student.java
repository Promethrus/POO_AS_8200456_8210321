import enums.Course;
import enums.ParticipateAs;

public class Student extends Participant{

    private Course course;
    private int school_Year;

    public Student(int id, ParticipateAs participateAs, Presentation list_Presentation[],Course course,int school_Year){
        super(id, participateAs, list_Presentation);
        this.course = course;
        this.school_Year = school_Year;

    }

}
