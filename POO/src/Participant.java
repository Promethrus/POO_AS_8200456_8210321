import enums.ParticipateAs;

public abstract class Participant implements estg.ipp.pt.tp02_conferencesystem.interfaces.Participant {
    private int id;
    private String name;
    private String bio;
    private boolean checkin;
    private ParticipateAs participateAs;
    private Presentation[] list_Presentation;
    private ConferenceImpl[] list_conference;


    public Participant(int id,ParticipateAs participateAs,Presentation list_Presentation[]){
        this.id = id;
        this.participateAs = participateAs;
        this.list_Presentation = list_Presentation;
    }

    public ConferenceImpl[] getList_conference() {return list_conference;}




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
