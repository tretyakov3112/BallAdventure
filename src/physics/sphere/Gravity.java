package physics.sphere;

public class Gravity extends Sphere2D {
    public double vy = 0;
    public double time;
    public double g;
    private double k;

    Gravity(double x0, double y0, double r, double k, double g, double dt) {
        super(x0, y0, r);
        this.g = g;
        this.k = k;
        this.time = dt;
    }

    public void changeCoord() {
        if (y0 + vy * time + r > 1000 - 15) {
            vy = -Math.sqrt(1.0 - k) * vy;
        } else {
            vy += g * time;
        }
        if (y0 < 1000 - r)
            y0 += (int) Math.ceil(vy * time);
    }
}