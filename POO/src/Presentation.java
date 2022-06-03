import enums.Equipment;
import estg.ipp.pt.tp02_conferencesystem.enumerations.PresentationState;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Participant;

public class Presentation implements estg.ipp.pt.tp02_conferencesystem.interfaces.Presentation {
    private int id;
    private Session session;
    private Participant participant;
    private Equipment list_Equipment[];

    public Presentation(int id, Session session, Participant participant, Equipment list_Equipment[]){
        this.id = id;
        this.session = session;
        this.participant = participant;
        this.list_Equipment = list_Equipment;
    }








    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getTitle() {
        return null;
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

    }

    @Override
    public Participant getPresenter() {
        return null;
    }
}
