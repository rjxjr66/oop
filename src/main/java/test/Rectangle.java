package test;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape implements Renderable, Clickable {
  private Vector2d size; // 선택

  private Rectangle(Builder builder) {
    super();

    position = builder.position;
    size = builder.size;
    color = builder.color;
  }

  public static class Builder {
    Vector2d position; // 필수
    Vector3d color = new Vector3d(0, 0, 0); // 선택
    Vector2d size = new Vector2d(10, 10); // 선택

    public Builder(Vector2d position) {
      this.position = new Vector2d(position);
    }

    public Builder setColor(Vector3d color) {
      this.color = new Vector3d(color);

      return this;
    }

    public Builder setSize(Vector2d size) {
      this.size = new Vector2d(size);

      return this;
    }

    public Rectangle build() {
      return new Rectangle(this);
    }
  }

  @Override
  public void Render(Graphics g, float dt) {
    g.setColor(new Color((int) this.color.x, (int) this.color.y, (int) this.color.z));
    g.fillRect((int) this.position.x, (int) this.position.y, (int) this.size.x, (int) this.size.y);
  }

  @Override
  public boolean checkClicked(Vector2d point) {
    if (position.x <= point.x && point.x <= position.x + size.x) {
      if (position.y <= point.y && point.y <= position.y + size.y) {
        return true;
      }
    }

    return false;
  }
}