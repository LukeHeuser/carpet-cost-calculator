public class Floor {
    private double width;
    private double length;

    public Floor (double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getArea() {
        return width * length;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setLength(double length) {
        if(length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

}
