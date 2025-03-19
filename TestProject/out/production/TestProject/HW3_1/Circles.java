package HW3_1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.03.2025
 */

public class Circles extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int POS_X = 500;
    private static final int POS_Y = 260;

    Circle[] sprites = new Circle[5];

    public Circles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setTitle("Circles");
        setLocation(POS_X, POS_Y);

        Canvas canvas = new Canvas(this);
        add(canvas, BorderLayout.CENTER);
        addSprites();

        setVisible(true);
    }

    private void addSprites() {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Circle();
        }
    }

    public void onRenderFrame(Canvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(Canvas canvas, float deltaTime) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
        checkCollision();
    }

    private void render(Canvas canvas, Graphics g) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }

    private void checkCollision() {
        for (int i = 0; i < sprites.length - 1; i++) {
            for (int j = i + 1; j < sprites.length; j++) {
                Circle circle1 = sprites[i];
                Circle circle2 = sprites[j];
                float dx = circle1.x - circle2.x;
                float dy = circle1.y - circle2.y;
                float dist = (float) Math.sqrt(dx * dx + dy * dy);
                float sumRad = circle1.halfWidth + circle2.halfWidth;

                if (dist <= sumRad) {
                    float tempVectorX = circle1.getVectorX();
                    float tempVectorY = circle1.getVectorY();
                    circle1.setVectorX(circle2.getVectorX());
                    circle1.setVectorY(circle2.getVectorY());
                    circle2.setVectorX(tempVectorX);
                    circle2.setVectorY(tempVectorY);
                }
                }
            }
        }
    }

