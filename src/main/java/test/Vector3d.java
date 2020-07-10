package test;

public class Vector3d {
    float x;
    float y;
    float z;
  
    public Vector3d(float x, float y, float z) { // 생성자: 초기 상태를 줄때 사용
      this.x = x;
      this.y = y;
      this.z = z;
    }

    public Vector3d(Vector3d v1) {
      this.x = v1.x;
      this.y = v1.y;
      this.z = v1.z;
    }
  
    @Override
    public String toString() {
      return String.format("(%.2f, %.2f, %.2f)", this.x, this.y, this.z);
    }
}