import enums.ParticipateAs;

public abstract class Participant implements estg.ipp.pt.tp02_conferencesystem.interfaces.Participant {
    private int id;
    private String name;
    private String bio;
    private boolean checkin;
    private ParticipateAs participateAs;
    private Presentation list_Presentation[];

    public Participant(int id,ParticipateAs participateAs,Presentation list_Presentation[]){
        this.id = id;
        this.participateAs = participateAs;
        this.list_Presentation = list_Presentation;
    }





    @Override
    public int getId() {return id;}


    public boolean getCheckin(){return this.checkin;}

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getBio() {
        return this.bio;
    }


    public void setParticipateAs(ParticipateAs participateAs) {this.participateAs = participateAs;}


    public void setCheckin(boolean checkin) {this.checkin = checkin;}


}
