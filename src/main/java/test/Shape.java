package test;

import java.util.ArrayList;

public class Shape {
    protected Vector2d position; // 필수
    protected Vector3d color; // 선택

    ArrayList<OnClickListener> listeners = new ArrayList<OnClickListener>();

    public Vector2d getPosition() {
        return position;
    }

    public void setPosition(Vector2d position) {
        this.position = position;
    }

    public void setColor(Vector3d color) {
        this.color = color;
    }

    public void addOnClickListner(OnClickListener l) {
        listeners.add(l);
    }
}