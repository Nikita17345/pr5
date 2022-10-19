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
        if (drawingAPI != null)
            drawingAPI.drawCircle(radius, x, y);
        else
            System.out.println("drawCircle() method");
    }
}
