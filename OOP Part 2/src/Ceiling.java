public class Ceiling {

    private int height;
    private int paintedColor;

    public Ceiling(int paintedColor, int height) {
        this.paintedColor = paintedColor;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
