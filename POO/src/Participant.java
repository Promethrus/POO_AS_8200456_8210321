import enums.ParticipateAs;

public abstract class Participant implements estg.ipp.pt.tp02_conferencesystem.interfaces.Participant {
    private int id;
    private 
    private ParticipateAs participateAs;
    private Presentation list_Presentation[];

    public Participant(int id,ParticipateAs participateAs,Presentation list_Presentation[]){
        this.id = id;
        this.participateAs = participateAs;
        this.list_Presentation = list_Presentation;
    }





    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getBio() {
        return null;
    }
}
