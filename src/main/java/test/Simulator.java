package test;

public class Simulator {
    float t = 0.f;
    float dt = 0.1f;
    float observationTime = 10.f;
    
    Thread thread;
    Renderer renderer = Renderer.getInstance();
  
    private static Simulator instance = null;
  
    private Simulator() {
      thread = new Thread(new Runnable(){
      
        @Override
        public void run() {
          while (true) {
            try {
              Thread.sleep(100);
            } catch (InterruptedException e) {}
          
            renderer.repaint(dt);
          }
        }
      });
    }
  
    public static Simulator getInstance() {
      if (Simulator.instance != null) {
        return Simulator.instance;
      } else {
        Simulator.instance = new Simulator();
        return Simulator.instance;
      }
    }
  
    public void run() {
      this.thread.run();
    }
  }