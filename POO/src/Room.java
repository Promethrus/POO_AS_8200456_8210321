import enums.Equipment;

public class Room implements estg.ipp.pt.tp02_conferencesystem.interfaces.Room {
    private int id;
    private String name;
    private int number_steats;
    private Equipment list_Equipment[];

    public Room(int id,int number_steats,Equipment list_Equipment[]){
        this.id = id;
        this.number_steats = number_steats;
        this.list_Equipment = list_Equipment;
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
    public int getNumberOfSeats() {
        return number_steats;
    }
}
