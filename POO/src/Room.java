import enums.Equipment;

public class Room implements estg.ipp.pt.tp02_conferencesystem.interfaces.Room {
    private int id;
    private int number_steats;
    private Equipment list_Equipment[];

    public Room(int id,int number_steats,Equipment list_Equipment[]){
        this.id = id;
        this.number_steats = number_steats;
        this.list_Equipment = list_Equipment;
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
    public int getNumberOfSeats() {
        return 0;
    }
}
