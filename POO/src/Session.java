import enums.SessionTheme;
import estg.ipp.pt.tp02_conferencesystem.exceptions.SessionException;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Participant;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Presentation;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Room;

import java.time.LocalDateTime;

public class Session implements estg.ipp.pt.tp02_conferencesystem.interfaces.Session {
    private int id;
    private String name;
    private SessionTheme sessionTheme;
    private Room room;
    private boolean presented;
    private Presentation list_Presentations[];
    private Participant list_presenters[];
    private LocalDateTime startTime;
    private int duration;


    public Session(int id, SessionTheme sessionTheme, Room room, Presentation list_Presentations[]) {
        this.id = id;
        this.sessionTheme = sessionTheme;
        this.room = room;
        this.list_Presentations = list_Presentations;

    }


    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public int getMaxDurationPerPresentation() {
        return 0;
    }

    @Override
    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    @Override
    public String getSessionTheme() {
        return String.valueOf(this.sessionTheme);
    }

    @Override
    public Room getRoom() {
        return this.room;
    }

    @Override
    public boolean addPresentation(Presentation presentation) throws SessionException {
        for (int i = 0;this.list_Presentations.length > i;i++){
            if(this.list_Presentations[i] == presentation){
                return false;
            }
        }
        int number_Presentation = getNumberOfPresentations();
        this.list_Presentations[number_Presentation] = presentation;
        return true;

    }

    @Override
    public void removePresentation(int id) throws SessionException {
        int position_presentaion = 0;
        for (int i = 0; this.list_Presentations.length > i; i++) {
            if (this.list_Presentations[i].getId() == id) {
                position_presentaion = i;
            }
        }
        int number_temp = position_presentaion;
        while (this.list_Presentations.length > number_temp) {
            this.list_Presentations[number_temp] = this.list_Presentations[number_temp + 1];
            number_temp++;
        }
        this.list_Presentations[position_presentaion] = null;
    }

    @Override
    public Presentation getPresentation(int id) throws SessionException {
        for (int i = 0; this.list_Presentations.length > i; i++) {
            if (this.list_Presentations[i].getId() == id) {
                return this.list_Presentations[i];
            }
        }
        return null;
    }


    @Override
    public Presentation[] getPresentations() {
        return this.list_Presentations;
    }

    @Override
    public boolean isStarted() {
        if (this.presented == true) {
            return true;
        }
        return false;
    }

    @Override
    public Participant[] getAllPresenters() {
        return this.list_presenters;
    }

    @Override
    public int getNumberOfPresentations() {
        int number_Session = 0;
        for (int i = 0; this.list_Presentations.length > i; i++) {
            if (this.list_Presentations[i] != null) {
                number_Session++;
            }
        }
        return number_Session;
    }

}
