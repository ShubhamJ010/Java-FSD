package Com.springcore.App1;

public class Students {
    private int Id;
    private String Name;
    private String Address;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Students [Id=" + Id + ", Name=" + Name + ", Address=" + Address + "]";
    }

    public static void main(String[] args) {

    }
}
