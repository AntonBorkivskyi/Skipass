package skipass;

public class Skipass{
    private int id;
    private String type;
    private boolean blocked = false;

    public Skipass(int id, String type){
        this.id = id;
        this.type = type;
    }

    // Default constructor
    Skipass(){}

    public void riding(){}

    public boolean isBlocked() {
        return blocked;
    }

    public boolean isValid() {
        return true;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
