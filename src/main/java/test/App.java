package test;

public class App
{
    public static void main( String[] args )
    {
        Simulator simulator = Simulator.getInstance();
        Renderer renderer = Renderer.getInstance();

        Rectangle rect1 = new Rectangle.Builder(new Vector2d(0, 0))
            .setSize(new Vector2d(50, 50))
            .build();
        Rectangle rect2 = new Rectangle.Builder(new Vector2d(150, 150))
            .setSize(new Vector2d(50, 50))
            .build();

        Circle circle1 = new Circle(new Vector2d(100, 100), 25);

        renderer.addRenderable(rect1);
        renderer.addRenderable(rect2);
        renderer.addRenderable(circle1);

        simulator.run();
    }
}
