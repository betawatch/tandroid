package qg;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class j1 {
    public double a;
    public double b;

    public j1(double d, double d10) {
        this.a = d;
        this.b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
