public class Point {
    // Fields
    private int x;
    private int y;

    // No-arg constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get the value of x
    public int getX() {
        return this.x;
    }

    // Method to get the value of y
    public int getY() {
        return this.y;
    }

    // Method to set the value of x
    public void setX(int x) {
        this.x = x;
    }

    // Method to set the value of y
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate the distance to point (0, 0)
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    // Method to calculate the distance to another point
    public double distance(Point point) {
        return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
    }

    // Method to calculate the distance to point (x, y)
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
}