package test;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;

public class Renderer {
    private Canvas canvas;
    private float dt;

    private ArrayList<Renderable> drawingList = new ArrayList<Renderable>();

    private static Renderer renderer = new Renderer();

    public static Renderer getInstance() {
        return Renderer.renderer;
    }

    private Renderer() {
        this.canvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                for (int i = 0; i < drawingList.size(); i++) {
                    drawingList.get(i).Render(g, dt);
                }
            }
        };

        this.canvas.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Vector2d coord = new Vector2d(e.getX(), e.getY());

                for (Renderable renderable : drawingList) {
                    if (renderable instanceof Clickable) {
                        Clickable obj = (Clickable) renderable;
                        if (obj.checkClicked(coord)) {
                            // To do: 클릭 이벤트 전달
                        }
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }
            
        });

        JFrame jp = new JFrame();
        jp.setSize(1200, 800);
        jp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jp.add(this.canvas);
        jp.setVisible(true);
    }

    public void repaint(float dt) {
        this.dt = dt;
        this.canvas.repaint();
    }

    public void addRenderable(Renderable renderable) {
        this.drawingList.add(renderable);
    }
}