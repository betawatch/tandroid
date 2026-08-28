package xf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h1 {
    public double a;
    public double b;

    public h1(double d, double d9) {
        this.a = d;
        this.b = d9;
    }

    public final double a(double d, double d9) {
        return Math.sqrt(Math.pow(d9 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
