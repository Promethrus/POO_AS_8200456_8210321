import enums.Field;
import estg.ipp.pt.tp02_conferencesystem.enumerations.ConferenceState;
import estg.ipp.pt.tp02_conferencesystem.exceptions.ConferenceException;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Participant;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Room;
import estg.ipp.pt.tp02_conferencesystem.interfaces.Session;
import estg.ipp.pt.tp02_conferencesystem.io.interfaces.Statistics;

import java.time.LocalDateTime;

public class Conference implements estg.ipp.pt.tp02_conferencesystem.interfaces.Conference{

    private int id;
    private String name;
    private int year;
    private Field field;
    private Session list_Session[];
    private Participant list_Participant[];
    private Room list_Room[];
    private ConferenceState conferenceState;
    private Participant list_SpeakerParticipants[];

    public Conference(int id,Session list_Session[],Participant list_Participant[],Room room[]){
        this.id = id;
        this.list_Participant = list_Participant;
        this.list_Session = list_Session;
        this.room = room;



    }

    @Override
    public int getid() {return this.id;}

    @Override
    public String getName() {return name;}

    @Override
    public String getField() {return String.valueOf(field);}

    @Override
    public ConferenceState getState() {
        return conferenceState;
    }

    @Override
    public void changeState(Field field) {this.field = field;}

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean addSession(Session session) throws ConferenceException {
        if (this.conferenceState == ConferenceState.ON_EDITING ){
            int number_Session = 0;
            for (int i = 0; this.list_Session.length > i;i++ ){
                if (this.list_Session[i] != null){
                    number_Session++;
                }
            }
            this.list_Session[number_Session] = session;
            return true;
        }
        return false;
    }

    @Override
    public void removeSession(int id) throws ConferenceException {
        int position_session = 0;
        for (int i = 0;this.list_Session.length > i;i++){
            if(this.list_Session[i].getId() == id) {
                position_session = i;
            }
        }
        int number_temp = position_session;
        while(this.list_Session.length > number_temp){
            this.list_Session[number_temp] = this.list_Session[number_temp+1];
            number_temp++;
        }
       this.list_Session[position_session] = null;


    }

    @Override
    public Session getSession(int id) throws ConferenceException {
        for (int i = 0;this.list_Session.length > i;i++){
            if(this.list_Session[i].getId() == id){
                return this.list_Session[i];
            }
        }
        return null;
    }

    @Override
    public Session[] getSessions() {return this.list_Session;}

    @Override
    public void checkIn(Participant participant) throws ConferenceException {

    }

    @Override
    public Participant getParticipant(int id) throws ConferenceException {
        for (int i = 0;this.list_Participant.length > i;i++){
            if(this.list_Participant[i].getId() == id){
                return this.list_Participant[i];
            }
        }
        return null;
    }

    @Override
    public Participant[] getParticipants() {return this.list_Participant;}

    @Override
    public Participant[] getSpeakerParticipants() {
        for (int i = 0;this.list_SpeakerParticipants.length > i;i++){
            for (int j = i;this.list_SpeakerParticipants.length > j;j++){
                if (this.list_SpeakerParticipants[i] == this.list_SpeakerParticipants[j]){

                    int position_participant = 0;
                    for (int k = 0;this.list_SpeakerParticipants.length > k;k++){
                        if(this.list_SpeakerParticipants[k].getId() == id) {
                            position_participant = k;
                        }
                    }
                    int number_temp = position_participant;
                    while(this.list_SpeakerParticipants.length > number_temp){
                        this.list_SpeakerParticipants[number_temp] = this.list_SpeakerParticipants[number_temp+1];
                        number_temp++;
                    }
                    this.list_SpeakerParticipants[position_participant] = null;
                }
            }
        }
        return this.list_SpeakerParticipants;
    }

    @Override
    public Session[] getRoomSessions(int roomId, LocalDateTime startDate, LocalDateTime endDate) throws ConferenceException {

        Session temp_array_Session[] = new Session[30];
        int k = 0;
        for (int i = 0;this.list_Session.length > i;i++) {
            if (this.list_Session[i].getRoom().getId() == roomId) {
                if (this.list_Session[i].getStartTime().isAfter(startDate)) {

                    int temp_duration = this.list_Session[i].getDuration() + startDate.getMinute();
                    if (endDate.getMinute() > temp_duration) {
                        temp_array_Session[k] = this.list_Session[i];
                        k++;
                    }

                }
            }
        }
        return temp_array_Session;
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
