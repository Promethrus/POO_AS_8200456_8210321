import enums.Education;
import enums.Field;
import enums.ParticipateAs;

public class Professor extends Participant{
    private Education education;
    private Field field;

    public Professor(int id, ParticipateAs participateAs, Presentation list_Presentation[],Education education, Field field){
        super(id, participateAs, list_Presentation);
        this.education = education;
        this.field = field;


    }


}
