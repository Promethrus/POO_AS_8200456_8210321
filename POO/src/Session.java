import enums.SessionTheme;
import estg.ipp.pt.tp02_conferencesystem.exceptions.SessionException;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Participant;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Presentation;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Room;

import java.time.LocalDateTime;

public class Session implements estg.ipp.pt.tp02_conferencesystem.interfaces.Session {
    private int id;
    private SessionTheme sessionTheme;
    private Room room;
    private Presentation list_Presentations[];

    public Session(int id, SessionTheme sessionTheme, Room room, Presentation list_Presentations[]){
        this.id = id;
        this.sessionTheme = sessionTheme;
        this.room = room;
        this.list_Presentations = list_Presentations;

    }








    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public int getMaxDurationPerPresentation() {
        return 0;
    }

    @Override
    public LocalDateTime getStartTime() {
        return null;
    }

    @Override
    public String getSessionTheme() {
        return null;
    }

    @Override
    public Room getRoom() {
        return null;
    }

    @Override
    public boolean addPresentation(Presentation presentation) throws SessionException {
        return false;
    }

    @Override
    public void removePresentation(int i) throws SessionException {

    }

    @Override
    public Presentation getPresentation(int i) throws SessionException {
        return null;
    }

    @Override
    public Presentation[] getPresentations() {
        return new Presentation[0];
    }

    @Override
    public boolean isStarted() {
        return false;
    }

    @Override
    public Participant[] getAllPresenters() {
        return new Participant[0];
    }

    @Override
    public int getNumberOfPresentations() {
        return 0;
    }
}
