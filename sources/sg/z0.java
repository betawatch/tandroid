package sg;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
