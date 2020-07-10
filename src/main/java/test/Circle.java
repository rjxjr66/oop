package test;

import java.awt.Graphics;

public class Circle extends Shape implements Renderable, Clickable {
    private int radius;

    public Circle(Vector2d position, int radius) {
        this.position = position;
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void Render(Graphics g, float dt) {
        g.fillOval((int)position.x - radius, (int)position.y - radius, radius * 2, radius * 2);
    }

    @Override
    public boolean checkClicked(Vector2d point) {
        return position.distance(point) < radius ? true : false;
    }
    
}