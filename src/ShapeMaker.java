public class ShapeMaker {
    private Shape circle;
    private Shape redCircle;
    private Shape greenCircle;

    public ShapeMaker() {
        circle = new Circle();
        redCircle = new Circle(10, 10, 20, new RedPen());
        greenCircle = new Circle(5, 5, 100, new GreenPen());
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRedCircle() {
        redCircle.draw();
    }

    public void drawGreenCircle() {
        greenCircle.draw();
    }


}
