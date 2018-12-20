import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Vector2D {
    public float x;
    public float y;

    public Vector2D() {
        this(0,0);
    }

    public Vector2D(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D addThis(float x,float y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vector2D subtractThis(float x,float y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vector2D scaleThis(float rate) {
        this.x *= rate;
        this.y *= rate;
        return this;
    }

    public float getLength() {
        return (float)Math.sqrt(x * x + y * y);
    }

    public Vector2D setLength (float length) {
        float rate = length /this.getLength();
        this.scaleThis(rate);
        return this;
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public float getAngle() {
        return (float)Math.atan(this.y / this.x);
    }

    public Vector2D setAngle(float angle) {
        float length = this.getLength();
        this.x = (float)(length * Math.cos(angle));
        this.y = (float)(length * Math.sin(angle));
        return this;
    }

    public static void main(String[] args) {
    }

}
