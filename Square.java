public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super(side, side);

    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);

    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public String toString(){
        return "A Square with side " + getSide()
                + ", which is a subclass of \n" + super.toString();
    }
    // ares = side^2
    public double getArea(){
        return getSide()*2;
    }
    // perimeter = 4*side
    public double getPerimeter(){
        return getSide()*4;
    }

}
