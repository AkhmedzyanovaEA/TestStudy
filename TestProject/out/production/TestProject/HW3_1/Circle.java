package HW3_1;


import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.03.2025
 */

public class Circle extends Sprite {

    private float vectorX = (float) (100 + Math.random() * 250f);
    private float vectorY = (float) (100 + Math.random() * 250f);
    private final Color color = new Color(
            (int) (Math.random() * 255),
            (int) (Math.random() * 255),
            (int) (Math.random() * 255)
    );


    public float getVectorX() {
        return vectorX;
    }

    public void setVectorX(float vectorX) {
        this.vectorX = vectorX;
    }

    public float getVectorY() {
        return vectorY;
    }

    public void setVectorY(float vectorY) {
        this.vectorY = vectorY;
    }

    public Circle() {
        halfWidth = 10 + (float)(Math.random() * 50f);
        halfHeight = halfWidth;
    }

    @Override
    public void render(Canvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int) getLeft(),
                (int) getTop(),
                (int) getWidth(),
                (int) getHeight()
        );
    }

    @Override
    public void update(Canvas canvas, float deltaTime) {
        x += vectorX * deltaTime;
        y += vectorY * deltaTime;

        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vectorX = -vectorX;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vectorX = -vectorX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vectorY = -vectorY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vectorY = -vectorY;
        }
    }
}
