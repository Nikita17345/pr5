public class BridgePatternDemo {

    public static void main(String[] args) {
        DrawingAPI red = new RedPen();
        DrawingAPI green = new GreenPen();

        Circle circle = new Circle(0, 0, 10, red);
        circle.draw();

        circle.drawingAPI = green;
        circle.draw();









    }
}
