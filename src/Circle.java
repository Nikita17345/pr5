public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawingAPI drawingAPI){
        super(drawingAPI);
        type = "Circle";
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(){}


    @Override
    public void draw() {
        drawingAPI.drawCircle(radius, x, y);
    }
}
