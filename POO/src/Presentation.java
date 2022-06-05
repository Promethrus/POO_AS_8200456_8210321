import enums.Equipment;
import estg.ipp.pt.tp02_conferencesystem.enumerations.PresentationState;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Participant;

public class Presentation implements estg.ipp.pt.tp02_conferencesystem.interfaces.Presentation {
    private int id;
    private String title;
    private Session session;
    private Participant participant;
    private Equipment list_Equipment[];
    private boolean presenter;

    public Presentation(int id, Session session, Participant participant, Equipment list_Equipment[]){
        this.id = id;
        this.session = session;
        this.participant = participant;
        this.list_Equipment = list_Equipment;
    }








    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public PresentationState getPresentationState() {
        return null;
    }

    @Override
    public void setPresented() {
        this.presenter = true;
    }

    @Override
    public Participant getPresenter() {
        return participant;
    }
}
