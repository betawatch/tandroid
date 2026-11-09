package sg;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a1 {
    public double a;
    public double b;

    public a1(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a(double d, double d2) {
        return Math.sqrt(Math.pow(d2 - this.b, 2.0d) + Math.pow(d - this.a, 2.0d));
    }
}
