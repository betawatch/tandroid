package sg;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z0 {
    public double a;
    public double b;

    public z0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a(double d, double d2) {
        return Math.sqrt(Math.pow(d2 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
