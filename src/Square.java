public class Square extends Rectangle {
    protected double side;


    Square(double side){
        this.side = side;
    }

    Square(double side, String color, boolean filled){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        length=this.getWidth();
        side=width;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
        length= this.getWidth();
        side=width;
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
        width=this.getLength();
        side=length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
