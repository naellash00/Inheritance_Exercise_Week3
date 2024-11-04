public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "green";
        filled = true;

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    // get filled
    public boolean isFilled(){
        return filled;
    }
    // set color
    public void setColor(String color){
        this.color = color;
    }
    // set filled
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        if(filled)
            return "A Shape with color of " + color + " and filled";
        return "A Shape with color of " + color + " and not filled ";
    }
}
