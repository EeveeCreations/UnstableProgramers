package Models;

public class Card {
//    Attributes
    private String name;
    private int effect;
    private int type;
    private String description;
    private boolean stealable;

    private char state;


//    Constructor
    public Card(String name, int effect, int type, boolean stealable) {
        this.name = name;
        this.type = type;
        this.stealable = stealable;
        this.state = 'c';
        setDescription();
        setEffect();
    }


//    Setters
    private void setEffect() {
//        TODO: Find on basis of name and type the right effect and set it.

    }

    private void setDescription() {
//        TODO: Make a list of descriptions and give
       this.description = " find on base of the name the description";

    }
    public void setState(char state){
        this.state = state;
    }

//    Getters

    public String getName() {
        return name;
    }

    public int getEffect() {
        return effect;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public char getState() {
        return state;
    }
}
