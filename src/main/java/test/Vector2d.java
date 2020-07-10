package test;

public class Vector2d {
    float x;
    float y;
  
    public Vector2d(float x, float y) { // 생성자: 초기 상태를 줄때 사용
      this.x = x;
      this.y = y;
    }

    public Vector2d(Vector2d v1) {
      this.x = v1.x;
      this.y = v1.y;
    }
  
    public void add(Vector2d v2) {
      this.x += v2.x;
      this.y += v2.y;
    }
  
    public void subtract(Vector2d v2) {
      this.x -= v2.x;
      this.y -= v2.y;
    }
  
    public float magnitude() {
      return (float)Math.sqrt(this.x*this.x + this.y*this.y);
    }
  
    @Override
    public String toString() {
      return String.format("(%.2f, %.2f)", this.x, this.y);
    }

    public float length() {
      return (float)Math.sqrt(x * x + y * y);
    }

    public float distance(Vector2d p2) {
      Vector2d p1 = new Vector2d(this);
      p1.subtract(p2);
      return p1.length();
    }
}