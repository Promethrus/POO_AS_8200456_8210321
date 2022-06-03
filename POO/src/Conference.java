import estg.ipp.pt.tp02_conferencesystem.enumerations.ConferenceState;
import estg.ipp.pt.tp02_conferencesystem.exceptions.ConferenceException;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Participant;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Room;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Session;
import estg.ipp.pt.tp02_conferencesystem.io.interfaces.Statistics;

import java.time.LocalDateTime;

public class Conference implements estg.ipp.pt.tp02_conferencesystem.interfaces.Conference {
    private int id;
    private Session list_Session[];
    private Participant list_Participant[];
    private Room room[];

    public Conference(int id,Session list_Session[],Participant list_Participant[],Room room[]){
        this.id = id;
        this.list_Participant = list_Participant;
        this.list_Session = list_Session;
        this.room = room;



    }








    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getField() {
        return null;
    }

    @Override
    public ConferenceState getState() {
        return null;
    }

    @Override
    public void changeState() {

    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public boolean addSession(Session session) throws ConferenceException {
        return false;
    }

    @Override
    public void removeSession(int i) throws ConferenceException {

    }

    @Override
    public Session getSession(int i) throws ConferenceException {
        return null;
    }

    @Override
    public Session[] getSessions() {
        return new Session[0];
    }

    @Override
    public void checkIn(Participant participant) throws ConferenceException {

    }

    @Override
    public Participant getParticipant(int i) throws ConferenceException {
        return null;
    }

    @Override
    public Participant[] getParticipants() {
        return new Participant[0];
    }

    @Override
    public Participant[] getSpeakerParticipants() {
        return new Participant[0];
    }

    @Override
    public Session[] getRoomSessions(int i, LocalDateTime localDateTime, LocalDateTime localDateTime1) throws ConferenceException {
        return new Session[0];
    }

    @Override
    public Room[] getRooms() {
        return new Room[0];
    }

    @Override
    public void generateSpeakerCertificates(String s) throws ConferenceException {

    }

    @Override
    public void generateParticipantCertificates(String s) throws ConferenceException {

    }

    @Override
    public String getSchedule() {
        return null;
    }

    @Override
    public Statistics[] getNumberOfParticipantsBySession() {
        return new Statistics[0];
    }

    @Override
    public Statistics[] getNumberOfSessionsByRoom() {
        return new Statistics[0];
    }
}
